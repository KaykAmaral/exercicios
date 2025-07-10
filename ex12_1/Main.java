package exercicios.ex12_1;

import exercicios.ex12_1.entities.Order;
import exercicios.ex12_1.entities.OrderItem;
import exercicios.ex12_1.entities.Product;
import exercicios.ex12_1.entities.enums.OrderStatus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("[ CLIENT DATA ]");
        System.out.print("Name:        ");
        String nameClient = sc.nextLine();
        System.out.print("Email:       ");
        String emailClient = sc.nextLine();
        System.out.print("Birth Date:  ");
        String birthClient = sc.nextLine();

        System.out.println();

        System.out.println("[ ORDER DATA ]");
        System.out.println("(PENDING_PAYMENT || PROCESSING || SHIPPED || DELIVERED)");
        System.out.print("Status:      ");
        String orderStatus = sc.next();
        System.out.print("How many items to this order? ");
        int items = sc.nextInt();


        System.out.println();

        Order order = new Order(nameClient, emailClient, birthClient, orderStatus);

        for (int i = 1; i <= items; i++) {
            System.out.println("Enter the #" + i + " item data:");
            System.out.print("Product Name:   ");
            String nameProduct = sc.nextLine();
            sc.nextLine();
            System.out.print("Product Price:  ");
            double priceProduct = sc.nextDouble();
            System.out.print("Quantity:       ");
            int quantityProduct = sc.nextInt();
            order.addItem(new OrderItem(quantityProduct, priceProduct, new Product(nameProduct, priceProduct)));
        }

        order.toMessage();

    }

}