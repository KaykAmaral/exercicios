package exercicios;
import java.util.Scanner;

public class ex1_5 {

    public static void main(String[] args) {

        // Programa que le o codigo e a quantidade de dois produtos e calcula e mostra o valor a ser pago

        Scanner input = new Scanner(System.in);
        int p1, p2, q1, q2;
        double v1, v2, vp1, vp2;

        System.out.println("[PRODUTO 1] Código --- Quantidade --- Valor");
        p1 = input.nextInt();
        q1 = input.nextInt();
        v1 = input.nextDouble();

        System.out.println("[PRODUTO 2] Código --- Quantidade --- Valor");
        p2 = input.nextInt();
        q2 = input.nextInt();
        v2 = input.nextDouble();

        vp1 = q1 * v1;
        vp2 = q2 * v2;

        System.out.printf("PRODUTO 1:   R$%.2f", vp1);
        System.out.printf("PRODUTO 2:   R$%.2f", vp2);

        input.close();

    }

}
