package exercicios;
import java.util.Scanner;

public class ex8_1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantos N° p/ digitar?  ");
        int n = teclado.nextInt();

        int[] vet = new int[n];

        for (int i = 0; i < vet.length; i++) {
            vet[i] = teclado.nextInt();
        }

        System.out.print("NUMEROS NEGATIVOS:   ");

        for (int i = 0; i < vet.length; i++) {
            if (vet[i] < 0) { System.out.print(vet[i] + "   "); }
        }

        teclado.close();

    }

}