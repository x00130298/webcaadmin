package controllers;

import play.mvc.*;

import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import models.users.*;
import views.html.*;

import models.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
  	public Result index() {
      	  	return ok(index.render(getUserFromSession()));
   	}
	public Result about(){
		return ok(about.render());
	}
	public Result contact(){
		return ok(contact.render());
	}
	public Result signup(){
		return ok(signup.render());
	}
	public Result prod(){

		List<Product> productsList = Product.findAll();
		return ok(prod.render(productsList));
	}
	public Result cart(){
		return ok(cart.render());
	}
	public Result account(){
		return ok(account.render());
	}
	public Result checkout(){
		return ok(checkout.render());
	}




//add after this

	@Security.Authenticated(Secured.class)
	public Result addProduct() {
		Form<Product> addProductForm = formFactory.form(Product.class);
		return ok(addProduct.render(addProductForm, getUserFromSession()));}


	@Security.Authenticated(Secured.class)
	@Transactional
	public Result addProductSubmit(){
		Form<Product> newProductForm = formFactory.form(Product.class).bindFromRequest();

		if(newProductForm.hasErrors()){
			return badRequest(addProduct.render(newProductForm, getUserFromSession));
		}
		Product newProduct = newProductForm.get();
		Product p = newProductForm.get();
		if(p.getId() == null){
			p.save();
		}
		else if(p.getId() != null){
			p.update();
		}
		newProduct.save();
		flash("success", "Product " + newProduct.getName() + " has been created!");
		return redirect(controllers.routes.HomeController.prod(0));
	}



	@Security.Authenticated(Secured.class)
	@Transactional
	public Result updateProduct(Long id){
		Product p;
		Form<Product> productForm;
		try{
			p = Product.find.byId(id);
			productForm = formFactory.form(Product.class).fill(p);
		}catch (Exception ex){
			return badRequest("error");
		}
		return ok(addProduct.render(productForm));
	}






	@Security.Authenticated(Secured.class)
	@With(AuthAdmin.class)
	@Transactional
	public Result deleteProduct(Long id){
		Product.find.ref(id).delete();
		flash("success", "Product has been deleted");
		return redirect(controllers.routes.HomeController.products(0));
	}

	private User getUserFromSession() {
		return User.getUserById(session().get("email"));
	}





}
