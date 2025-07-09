package exercicios;
import java.util.Scanner;

public class ex8_10 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantos alunos você quer digitar?   ");
        int x = teclado.nextInt();

        String[] nomes = new String[x];
        boolean[] aprovado = new boolean[x];

        for (int i = 0; i < nomes.length; i++) {
            teclado.nextLine();
            nomes[i] = teclado.nextLine();
            double a = teclado.nextDouble();
            double b = teclado.nextDouble();

            if ((a + b) / 2  >=  6) { aprovado[i] = true; } else { aprovado[i] = false; }

        }

        System.out.println("--- ALUNOS APROVADOR ---");

        for (int i = 0; i < aprovado.length; i++) {
            if (aprovado[i]) { System.out.println(nomes[i]); }
        }

    }

}