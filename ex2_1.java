package exercicios;
import java.util.Scanner;

public class ex2_1 {

    public static void main(String[] args) {

        // Programa le um numero e informa se ele é positivo ou negativo (0 esta sendo considerado positivo)

        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int x = input.nextInt();
        if (x >= 0) {
            System.out.printf("O número %d é positivo", x);
        } else {
            System.out.printf("O número %d é negativo", x);
        }

        input.close();

    }

}
