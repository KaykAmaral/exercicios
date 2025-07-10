package exercicios.ex12_1.entities;

public class OrderItem {

    private Integer quantity;
    private Double price;
    private Product product;

    // CONSTRUCTOR
    public OrderItem(int quantity, double price, Product product) {
        setQuantity(quantity);
        setPrice(price);
        setProduct(product);
    }

    // SETTERS
    private void setQuantity(Integer quantity) { this.quantity = quantity; }
    private void setPrice(Double price) { this.price = price; }
    private void setProduct(Product product) { this.product = product; }

    // GETTERS
    private Integer getQuantity() { return quantity; }
    private Double getPrice() { return price; }
    private Product getProduct() { return this.product; }

    // METHODS
    public Double subTotal() { return (getPrice() * (float)getQuantity()); }

    @Override
    public String toString() {
        return getProduct().toString() + ", Quantity: " + getQuantity() + ", Subtotal: $" + subTotal();
    }

}