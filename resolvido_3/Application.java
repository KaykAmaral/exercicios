package exercicios.resolvido_3;

import exercicios.resolvido_3.Service.BrazilInterestService;
import exercicios.resolvido_3.Service.UsaInterestService;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("You're from USA or Brazil?      ");
        String country = sc.next();
        System.out.print("Amount:                         ");
        double amount = sc.nextDouble();
        System.out.print("Months:                         ");
        int months = sc.nextInt();

        if (country.equals("USA")) {
            UsaInterestService uis = new UsaInterestService(1.0);
            System.out.println();
            System.out.print("Payment after " + months + " months:"  );
            System.out.printf("%.2f\n",uis.payment(amount, months));
        } else if (country.equals("Brazil")) {
            BrazilInterestService bis = new BrazilInterestService(2.0);
            System.out.println();
            System.out.print("Payment after " + months + " months:  ");
            System.out.printf("%.2f\n",bis.payment(amount, months));
        }




    }

}