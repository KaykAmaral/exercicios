package exercicios;
import java.util.Scanner;

public class ex8_3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantas pessoas você quer digitar?   ");
        int n = teclado.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];

        int numIdade = 0;
        double somAltura = 0;
        double medAltura;

        for (int i = 0; i < nomes.length; i++) {
            teclado.nextLine();
            System.out.print("NOME:    ");
            nomes[i] = teclado.nextLine();
            System.out.print("IDADE:   ");
            idades[i] = teclado.nextInt();
            System.out.print("ALTURA:  ");
            alturas[i] = teclado.nextDouble();

            somAltura += alturas[i];

            if (idades[i] < 16) { numIdade++; }

        }

        medAltura = somAltura / alturas.length;

        System.out.printf("ALTURA MÉDIA:                    %.2f \n", medAltura);
        System.out.println("PESSOAS COM MENOS DE 16 ANOS:    " + (numIdade * 100 / nomes.length) + "%");
        for (int i = 0; i < nomes.length; i++) {
            if (idades[i] < 16) {
                System.out.println(nomes[i]);
            }
        }

    }

}