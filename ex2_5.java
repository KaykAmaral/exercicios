package exercicios;
import java.util.Scanner;
public class ex2_5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Digite o código:        ");
        int cod = input.nextInt();
        System.out.println("Digite a quantidade:  ");
        int qnt = input.nextInt();

        double preco;

        if(cod == 1){
            preco = 4 * qnt;
        } else if (cod == 2){
            preco = 4.5 * qnt;
        } else if (cod == 3){
            preco = 5 * qnt;
        } else if (cod == 4){
            preco = 2 * qnt;
        } else if (cod == 5){
            preco = 1.5 * qnt;
        }

        input.close();

    }

}
