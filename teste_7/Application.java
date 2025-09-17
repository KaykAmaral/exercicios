package exercicios.teste_7;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.0));
        list.add(new Product("Notebook", 40.0));
        list.add(new Product("Bottle", 10.0));

        list.sort((p1 , p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

        for (Product p : list) {
            System.out.printf("%s  $%.2f\n", p.getName(), p.getPrice());
        }

    }

}