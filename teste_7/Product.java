package exercicios.teste_7;

public class Product {

    private String name;
    private Double price;

    public Product(String name, Double price) {
        setName(name); setPrice(price);
    }

    private void setName(String name) { this.name = name; }
    private void setPrice(Double price) { this.price = price; }

    public String getName() { return this.name; }
    public Double getPrice() { return this.price; }

}