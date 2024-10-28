package exercicios;
import java.util.Scanner;

public class Ex2_4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x;


        System.out.print("inicio do jogo: ");
        int ini = input.nextInt();
        System.out.print("Fim do jogo:    ");
        int fim = input.nextInt();


        if (ini == fim){
            System.out.println("DURAÇÃO = 24h");
        } else if(ini < fim) {
            x = fim - ini;
            System.out.printf("DURAÇÃO = %dh", x);
        } else {
            x = (24 - ini) + 2;
            System.out.printf("DURAÇÃO = %dh", x);
        }

    }

}
