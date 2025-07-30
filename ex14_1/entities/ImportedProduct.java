package exercicios.ex14_1.entities;

public final class ImportedProduct extends Product {

    private Double customsFee;

    // CONSTRUCTOR
    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        setCustomsFee(customsFee);
    }

    // SETTER
    private void setCustomsFee(Double customsFee) { this.customsFee = customsFee; }

    // GETTER
    private Double getCustomsFee() { return this.customsFee; }

    // METHODS
    public Double totalPrice() { return (getPrice() * getCustomsFee()); }
    @Override
    public String priceTag() {
        System.out.printf("%s  $%.2f  (Custom Fee: $%.2f)\n", getName(), totalPrice(), getCustomsFee());
        return null;
    }



}
