package exercicios;
import java.util.Scanner;

public class ex8_8 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int qPares = 0;
        double somPares = 0;
        double medPares;

        System.out.print("Qual o tamanho do vetor?   ");
        int x = teclado.nextInt();

        int[] vet = new int[x];

        for (int i = 0; i < vet.length; i++) {
            vet[i] = teclado.nextInt();
            if (vet[i] % 2 == 0) {
                qPares++;
                somPares += vet[i];
            }
        }

        medPares = somPares / vet.length;

        if (qPares != 0) {
            System.out.println("MÉDIA DOS PARES:   " + medPares);
        } else {
            System.out.println("NÃO HÁ NÚMEROS PARES");
        }

    }

}