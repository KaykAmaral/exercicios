package exercicios;
import java.util.Scanner;

public class ex1_1 {

    public static void main (String[] args) {

        // Programa que le dois valores e calcula e exibe a soma desses dois valores

        Scanner input = new Scanner(System.in); // Criação do Scanner
        int x = input.nextInt(); // Lendo valor de X
        int y = input.nextInt(); // Lendo valor de Y
        int z = x+y;

        System.out.println("VALORES DIGITADOS:");
        System.out.print("X = " + x + "\nY= " + y + "\n");
        System.out.println("SOMA DOS VALORES = " + z);

        input.close();

    }

}
