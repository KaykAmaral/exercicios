package exercicios;
import java.util.Scanner;

public class Ex2_1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int x = input.nextInt();
        if (x >= 0) {
            System.out.printf("O numero %d é positivo", x);
        } else {
            System.out.printf("O numero %d é negativo", x);
        }

        input.close();

    }

}
