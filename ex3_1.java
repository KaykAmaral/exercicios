package exercicios;
import java.util.Scanner;
public class ex3_1 {

    public static void main(String[] args) {

        // Programa que lê uam senha, caso a senha seja != de 2002, mostra acesso negado. Isso se repete ate o
        // usuario digitar a senha correta

        Scanner input = new Scanner(System.in);
        int x = 0;

        while (x != 2002) {
            x = input.nextInt();

            if (x != 2002) {
                System.out.println("Aceso negado");
            } else {
                System.out.println("Acesso permitido");
            }

        }

        input.close();

    }

}