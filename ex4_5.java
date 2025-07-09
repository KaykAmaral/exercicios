package exercicios;
import java.util.Scanner;
public class ex4_5 {

    public static void main(String[] args) {

        // Progreama que lê um numero e mostra o fatorial do numero digitado

        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = 1;
        if (x == 0) {
            System.out.println("0! = 1");
        } else {
            for (int i = 1; i <= x; i++) {
                y *= i;
            }
            System.out.printf("%d! = %d", x, y);
        }

        input.close();

    }

}