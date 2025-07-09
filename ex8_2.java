package exercicios;
import java.util.Scanner;

public class ex8_2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantos N° p/ digitar?  ");
        int n = teclado.nextInt();

        double[] vet = new double[n];
        double soma = 0;
        double media;

        for (int i = 0; i < vet.length; i++) {
            vet[i] = teclado.nextDouble();
            soma += vet[i];
        }

        media = soma / vet.length;

        System.out.print("VALORES:   ");
        for (int i = 0; i < vet.length; i++) { System.out.print(vet[i] + "   "); }
        System.out.println();


        System.out.println("SOMA:      " + soma);
        System.out.println("MEDIA:     " + media);

        teclado.close();

    }

}