package exercicios;
import java.util.Scanner;
public class ex4_7 {

    public static void main(String[] args) {

        // Programa que lê um numero e mostra os n*n e n*n*n ate o numero digitado

        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int quadrado, cubo;

        if (x > 0) {
            for (int i = 1; i <= x; i++) {
                quadrado = i * i; cubo = i * i * i;
                System.out.printf("%d   %d   %d\n", i, quadrado, cubo);
            }
        }

        input.close();

    }

}