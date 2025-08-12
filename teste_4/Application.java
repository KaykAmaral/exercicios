package exercicios.teste_4;

import java.util.Scanner;
import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> integers = new ArrayList<>();
        ArrayList<Double> doubles = new ArrayList<>();
        ArrayList<Object> copyIntegers = new ArrayList<>();
        ArrayList<Object> copyDoubles = new ArrayList<>();

        System.out.println("Text three int numbers:");
        for (int i = 1; i <= 3; i++) {
            System.out.print(i + ": ");
            Integer x = sc.nextInt();
            integers.add(x);
        }
        System.out.println("Text three double numbers:");
        for (int i = 1; i <= 3; i++) {
            System.out.print(i + ": ");
            Double x = sc.nextDouble();
            doubles.add(x);
        }


        System.out.print("\nIntegers Copy: ");
        copy(integers, copyIntegers);
        printList(copyIntegers);
        System.out.print("Double Copy:   ");
        copy(doubles, copyDoubles);
        printList(copyDoubles);

    }

    public static void copy(ArrayList<? extends Number> source, ArrayList<? super Number> destiny) {
        /* This can replace to:
        * for (Number number : source) {
        *   destiny.add(number);
        * }
        */
        destiny.addAll(source);
    }

    public static void printList(ArrayList<?> list) {
        if (list.isEmpty()) {
            System.out.println("[ERROR] - List can't be empty!");
        } else {
            System.out.print("[   ");
            for (Object o : list) {
                System.out.print(o + "   ");
            }
            System.out.println("]\n");
        }
    }

}