package exercicios;
import java.util.Scanner;

public class ex1_2 {

    public static void main(String[] args){

        // Programa que calcula e mostra a area de um circulo com 4 casas decimais

        Scanner input = new Scanner(System.in);
        double raio = input.nextFloat();
        double area = 3.14159 * (Math.pow(raio, 2)); // calculando area de um circulo
        System.out.printf("AREA DO CIRCULO = %.4f ", area);

        input.close();

    }

}
