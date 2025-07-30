package exercicios.ex14_1.entities;

import java.time.LocalDate;
import java.util.Date;
import java.time.format.DateTimeFormatter;
public final class UsedProduct extends Product{

    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private LocalDate manufacturedDate;

    // CONSTRUCTOR
    public UsedProduct(String name, Double price, String manufacturedDate) {
        super(name, price);
        setManufacturedDate(manufacturedDate);
    }

    // SETTER
    private void setManufacturedDate(String date) { this.manufacturedDate = LocalDate.parse(date, fmt); }

    // GETTER
    private LocalDate getManufacturedDate() { return this.manufacturedDate; }

    // METHODS
    @Override
    public String priceTag() {
        System.out.printf("%s (used)  $%.2f", getName(), getPrice());
        System.out.println("   (Manufacture date: " + getManufacturedDate().format(fmt) + ")");
        return null;
    }


}
