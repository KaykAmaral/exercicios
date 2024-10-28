package exercicios;
import java.util.Scanner;
public class ex4_4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        float num1;
        float num2;
        float resultado;

        for (int i = 0; i < x; i++) {
            num1 = input.nextInt();
            num2 = input.nextInt();
            if (num2 == 0) {
                System.out.println("Divisão impossível");
            } else if (num1 == 0) {
                System.out.printf("%.2f\n", num2);
            } else {
                resultado = num1 / num2;
                System.out.println(resultado);
            }
        }

        input.close();

    }

}