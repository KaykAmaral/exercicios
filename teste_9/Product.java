package exercicios.teste_9;

public class Product {

    private String name;
    private Double price;

    public Product(String name, Double price) {
        setName(name); setPrice(price);
    }

    public void setName(String name) { this.name = name; }
    public void setPrice(Double price) { this.price = price; }

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