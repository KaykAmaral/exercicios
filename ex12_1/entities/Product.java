package exercicios.ex12_1.entities;

public class Product {

    private String name;
    private Double price;

    public Product(String name, Double price) {
        setName(name);
        setPrice(price);
    }

    // SETTERS
    public void setName(String name) { this.name = name; }
    public void setPrice(Double price) { this.price = price; }

    // GETTERS
    public String getName() { return this.name; }
    public Double getPrice() { return price; }

    @Override
    public String toString() {
        return getName();
    }
    
}