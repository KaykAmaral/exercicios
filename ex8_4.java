package exercicios;
import java.util.Scanner;
public class ex8_4 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Quantos n° você vai digitar?   ");
        int n = teclado.nextInt();

        int[] vet = new int[n];
        int qPares = 0;

        for (int i = 0; i < vet.length; i++) {
            vet[i] = teclado.nextInt();

            if (vet[i] % 2 == 0) { qPares++; }

        }

        System.out.print("N°s PARES:   ");
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] % 2 == 0) { System.out.print(vet[i] + "   "); }
        }
        System.out.println();

        System.out.println("Q° DE PARES:   " + qPares);

    }

}
