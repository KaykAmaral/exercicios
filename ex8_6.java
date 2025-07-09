package exercicios;
import java.util.Scanner;
public class ex8_6 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Qual o tamanho dos vetores?   ");
        int x = teclado.nextInt();

        int[] a = new int[x];
        int[] b = new int[x];
        int[] ab = new int[x];


        System.out.println("--- ESCREVA OS VALORES DO 1° VETOR ---");
        for (int i = 0; i < a.length; i++) { a[i] = teclado.nextInt(); }

        System.out.println("--- ESCREVA OS VALORES DO 2° VETOR ---");
        for (int i = 0; i < b.length; i++) { b[i] = teclado.nextInt(); }

        System.out.println("--- VETOR RESULTANTE ---");
        for (int i = 0; i < ab.length; i++) {
            ab[i] = a[i] + b[i];
            System.out.print(ab[i] + "   ");
        }

    }

}