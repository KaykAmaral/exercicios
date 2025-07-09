package exercicios;
import java.util.Scanner;

public class ex2_6 {

    public static void main(String[] args) {

        // Le uma variavel e diz em qual intevalo ela esta, caso não esteja, mostra uma mensagem de "fora do intervalo"

        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero:");
        int x = input.nextInt();

        if (x < 0 || x > 100) {
            System.out.println("Numero fora do intervalo");
        } else {
            if (x < 25) {
                System.out.println("Numero entre [0 --- 25]");
            } else if (x < 50) {
                System.out.println("Numero entre [25 --- 50]");
            } else if (x < 75) {
                System.out.println("Numero entre [50 --- 75]");
            } else {
                System.out.println("Numero entre [75 --- 100]");
            }
        }

        input.close();

    }

}