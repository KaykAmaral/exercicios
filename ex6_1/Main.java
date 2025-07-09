package exercicios.ex6_1;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        // Programa utilizado para converter o valor de uma moeda com o imposto de 6% e mostra o total a se pegar

        Scanner input = new Scanner(System.in);

        System.out.println("[Valor da Moeda] [Quantidade da Moeda]");

        double x = ConversorDeMoeda.converter(input.nextDouble(), input.nextDouble());

        System.out.printf("Total a Pagar: %.2f", x);

        input.close();

    }

}