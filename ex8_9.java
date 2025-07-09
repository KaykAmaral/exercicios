package exercicios;
import java.util.Scanner;

public class ex8_9 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantas pessoas você quer digitar?   ");
        int x = teclado.nextInt();

        String[] nomes = new String[x];
        int[] idades = new int[x];

        int velho = 0;

        for (int i = 0; i < nomes.length; i++) {
            teclado.nextLine();
            nomes[i] = teclado.nextLine();
            idades[i] = teclado.nextInt();

            if (idades[i] > velho) { velho = idades[i]; }

        }

        System.out.print("MAIS VELHO:   ");

        for (int i = 0; i < idades.length; i++) {
            if (idades[i] == velho) { System.out.print( nomes[i] + "   "); }
        }




    }

}