package exercicios;
import java.util.Scanner;
public class ex4_3 {

    public static void main(String[] args) {

        // Programa que lê 3 variaveis e calcula a media ponderada deles e exibe na tela

        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        float a, b, c, med;
        for (int i = 0; i < x; i++) {
            a = input.nextFloat();
            b = input.nextFloat();
            c = input.nextFloat();
            med = ((a*2) + (b*3) + (c*5)) / 10;
            System.out.printf("MÉDIA = %.2f \n", med );
        }

        input.close();

    }

}