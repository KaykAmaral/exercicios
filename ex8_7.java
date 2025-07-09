package exercicios;
import java.util.Scanner;

public class ex8_7 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Qual o tamanho do vetor?   ");
        int x = teclado.nextInt();

        double[] vet = new double[x];
        double media, soma;
        soma = 0;

        System.out.println("--- DIGITE OS VALORES DO VETOR ---");
        for (int i = 0; i < vet.length; i++) {
            vet[i] = teclado.nextDouble();
            soma += vet[i];
        }

        media = soma / vet.length;
        System.out.printf("MÉDIA DO VETOR:  %.2f \n", media);

        System.out.print("ELEMENTOS ABAIXO DA MÉDIA:    ");
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] < media) {
                System.out.print(vet[i] + "   ");
            }
        }

    }

}