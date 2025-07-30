package exercicios.ex14_1.entities;

public class Product {

    private String name;
    private Double price;

    // CONSTRUCTOR
    public Product(String name, Double price) {
        setName(name);
        setPrice(price);
    }

    // SETTERS
    protected void setName(String name) { this.name = name; }
    protected void setPrice(Double price) { this.price = price; }

    // GETTERS
    protected String getName() { return this.name; }
    protected Double getPrice() { return this.price; }

    // METHODS
    public String priceTag() {
        System.out.printf("%s  $%.2f \n", getName(), getPrice());
        return null;
    }

}
