package exercicios.ex13_1;

public class Product {

    private String name;
    private double price;
    private int quantity;

    // CONSTRUCT
    public Product(String n, double p, int q) {
        setName(n); setPrice(p); setQuantity(q);
    }

    // GETTERS
    public String getName() { return name; }
    private double getPrice() { return price; }
    private int getQuantity() { return quantity; }

    // SETTERS
    private void setName(String name) { this.name = name; }
    private void setPrice(double price) { this.price = price; }
    private void setQuantity(int quantity) { this.quantity = quantity; }

    // METHODS
    public double total() { return (getPrice() * (float)getQuantity()); }


}
