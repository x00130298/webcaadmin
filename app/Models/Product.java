package models;

public class Product{

    private Long id;
    private String name;
    private String description;
    private int stock;
    private double price;

    public Product(){
        public Product(Long getId(), String getName(), String getDescription(), int stock, double price)
        this.setId(getId());
        this.setName(getName());
        this.setDescription(getDescription());
        this.setStock(stock);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}