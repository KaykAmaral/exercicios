package exercicios.ex8_desafio;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantos quartos vão ser alugados?   ");
        int num = teclado.nextInt();

        Aluguel[] vet = new Aluguel[10];


        System.out.println("[NOME]\n[EMAIL]\n[N°QUARTO (1 - 10)]\n");

        for (int i = 0; i < num; i++) {
            teclado.nextLine();
            String a = teclado.nextLine();
            String b = teclado.nextLine();
            int x = teclado.nextInt();

            if (vet[x-1] == null) {
                Aluguel aluguel = new Aluguel(a, b);
                vet[x-1] = aluguel;
            } else {
                System.out.println("[ERRO] - Quarto está ocupado");
                i--;
            }

            System.out.println("--------------------");

        }

        for (int i = 0; i < vet.length; i++) {
            if (vet[i] != null) {
                System.out.print("QUARTO " + (i+1) + ":   ");
                vet[i].toString();
            }
        }

    }

}