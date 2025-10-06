package exercicios.teste_9;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Application {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.00));
        list.add(new Product("HD Case", 80.90));

        // This method uses Consumer<T>
        list.forEach(p -> p.setPrice(p.getPrice() * 1.1));

        /*
        *   This may can write using Consumer<T>
        *   Consumer<Product> cons = p -> p.setPrice(p.getPrice * 1.1);
        *   list.forEach(cons);
        */

        for (Product p : list) {
            System.out.println(p);
        }

    }

}