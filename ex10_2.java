package exercicios;
import java.util.Scanner;
public class ex10_2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("[Tam. LINHA]   [Tam. COLUNA]");
        int x = teclado.nextInt();
        int y = teclado.nextInt();

        int[][] matrix = new int[x][y];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                matrix[i][j] = teclado.nextInt();
            }
        }


        System.out.print("Qual n° será a referência?   ");
        int ref = teclado.nextInt();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < y; j++) {
                if (matrix[i][j] == ref) {
                    System.out.println("POSIÇÃO: " + i + "," + j);

                    if (i > 0) { System.out.println("   " + matrix[i-1][j]); }                         // CIMA
                    if (j > 0) { System.out.print(matrix[i][j-1]); }                                  // ESQUERDA
                    System.out.print("  " + matrix[i][j] + "  " );                                   // REFERENCIA
                    if (j < matrix[0].length - 1) { System.out.println(matrix[i][j+1]); }           // DIREITA
                    if (i < matrix.length - 1) { System.out.println("   " + matrix[i+1][j]); }     // BAIXO

                    System.out.println();
                    System.out.println();

                }
            }
        }


    }

}