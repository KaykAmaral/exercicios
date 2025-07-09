package exercicios.ex5_2;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        // Programa que lê o nome, o salario do funcionario e mostra o novo salario desse funcionario

        Scanner input = new Scanner(System.in);
        System.out.println("DIGITE [nome] [salario bruto] [taxa] [% de incremento]");

        funcionario f = new funcionario(input.nextLine(), input.nextDouble(), input.nextDouble(), input.nextDouble());
        f.toString();



    }

}