package exercicios;
import java.util.Scanner;

public class ex1_3 {

    public static void main(String[] args) {

        // Programa que le 4 variaveis, faz um calculo com eles e exibe o resultado

        Scanner input = new Scanner(System.in);
        int A,B,C,D, x;
        A = input.nextInt();
        B = input.nextInt();
        C = input.nextInt();
        D = input.nextInt();

        x = A*B - C*D;

        System.out.print("DIFERENÇA = " + x);

        input.close();

    }

}
