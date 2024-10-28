package exercicios;
import java.util.Scanner;

public class ex4_1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número de 1 a 1000");
        int x = input.nextInt();

        if (x >= 1 && x <= 1000) {
            for (int i = 0; i < x; i++) {
                if (i % 2 == 1) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.print("[ERRO] O NÚMERO DIGITADO É INVÁLIDO");
        }

        input.close();

    }

}
