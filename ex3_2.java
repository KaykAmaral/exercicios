package exercicios;
import java.util.Scanner;

public class ex3_2 {

    public static void main(String[] args) {

        // Programa que le 2 n°s e informa em qual quadrante pertence o ponto criado pelos dois n°s

        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();

        while (x != 0  ||  y != 0) {

            if (x > 0 && y > 0) { // QUADRANTE 1
                System.out.println("Q1");
            } else if (x < 0 && y > 0) { // QUADRANTE 2
                System.out.println("Q2");
            } else if (x < 0 && y < 0) {
                System.out.println("Q3"); // QUADRANTE 3
            } else if (x > 0 && y < 0) {
                System.out.println("Q4"); // QUADRANTE 4
            }

            x = input.nextInt();
            y = input.nextInt();

        }

        input.close();

    }

}