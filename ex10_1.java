package exercicios;
import java.util.Scanner;
public class ex10_1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int negativos = 0;

        System.out.print("Qual o tamanho da matrix?   ");
        int x = teclado.nextInt();

        int[][] matrix = new int[x][x];
        int[] diagonalPrincipal = new int[x];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {

                matrix[i][j] = teclado.nextInt();

                if (matrix[i][j] < 0) { negativos++; }

                if (i == j) { diagonalPrincipal[i] = matrix[i][j]; }

            }
        }

        System.out.print("DIAGONAL PRINCIPAL:   ");
        for (int i = 0; i < diagonalPrincipal.length; i++) {
            System.out.print(diagonalPrincipal[i] + "   ");
        }

        System.out.println();

        System.out.println("Quantos números negativos?   " + negativos);

    }

}