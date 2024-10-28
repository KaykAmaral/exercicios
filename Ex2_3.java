package exercicios;
import java.util.Scanner;

public class Ex2_3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite dois valores: ");
        int a = input.nextInt();
        int b = input.nextInt();
        if (a % b == 0 || b % a == 0) {
            System.out.printf("Os numeros %d e %d são multiplos", a, b);
        } else {
            System.out.printf("os numeros %d e %d não são multiplos", a, b);
        }

        input.close();

    }

}
