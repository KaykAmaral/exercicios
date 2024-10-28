package exercicios;
import java.util.Scanner;

public class Ex2_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int x = input.nextInt();

        if (x % 2 == 0) {
            System.out.println("Numero par");
        } else {
            System.out.println("Numero impar");
        }

        input.close();

    }

}
