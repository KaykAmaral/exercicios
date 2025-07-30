package exercicios.ex14_1;

import exercicios.ex14_1.entities.Product;
import exercicios.ex14_1.entities.UsedProduct;
import exercicios.ex14_1.entities.ImportedProduct;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();


        System.out.print("Enter the number of products:            ");
        int x = sc.nextInt();

        for (int i = 1; i <= x; i++) {
            System.out.println("Product #" + i + " data:");
            System.out.print("common, used or imported (c/u/i)?        ");
            String answer = sc.next();
            System.out.print("Name:                                    ");
            String name = sc.next();
            System.out.print("Price:                                   ");
            Double price = sc.nextDouble();

            if (answer.equals("c")) {
                products.add(new Product(name, price));
            } else if (answer.equals("u")) {
                System.out.print("Manufectured Date (DD/MM/YYYY):          ");
                String date = sc.next();
                products.add(new UsedProduct(name, price, date));
            } else if (answer.equals("i")) {
                System.out.print("Customs fee:                             ");
                Double customFee = sc.nextDouble();
                products.add(new ImportedProduct(name, price, customFee));
            } else {
                System.out.println("[ ERROR ] - Invalid type product"); i--;
            }

        }

        System.out.println();
        System.out.println("PRICE TAGS:");

        for (Product e : products) {
            e.priceTag();
        }

    }

}
