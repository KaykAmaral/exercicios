package exercicios.teste_8;

public class Product {

    private String name;
    private Double price;

    public Product(String name, Double price) {
        setName(name); setPrice(price);
    }

    private void setName(String name) { this.name = name; }
    private void setPrice(Double price) { this.price = price; }

    public String getName() { return name; }
    public Double getPrice() { return this.price; }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}