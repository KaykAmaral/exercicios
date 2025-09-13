/*package exercicios.teste_1;

import exercicios.teste_1.Services.PrintService;

import java.util.Scanner;
public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        PrintService<String> names = new PrintService<>();
        PrintService<Integer> ages = new PrintService<>();

        System.out.print("How many data you'll text?   ");
        int x = sc.nextInt();

        for (int i = 0; i < x; i++) {
            System.out.print("Name:   ");
            names.addItem(sc.next());
            System.out.print("Age:    ");
            ages.addItem(sc.nextInt());
        }

        System.out.println("1st name & age:");
        System.out.println("Name:  " + names.first());
        System.out.println("Age:   " + ages.first());

        sc.close();

    }

}
*/