package exercicios;
import java.util.Scanner;

public class ex8_5 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantos N°s você quer digitar?   ");
        int n = teclado.nextInt();

        double maior = 0;
        int posicao = -1;
        double[] vet = new double[n];

        for (int i = 0; i < vet.length; i++) {
            vet[i] = teclado.nextDouble();

            if (vet[i] > maior) {
                maior = vet[i];
                posicao = i;
            }

        }

        System.out.printf("MAIOR VALOR:  %.2f\n", maior);
        System.out.println("POSIÇÃO:  " + posicao);


    }

}