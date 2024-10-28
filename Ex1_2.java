package exercicios;
import java.util.Scanner;

public class Ex1_2 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double raio = input.nextFloat();
        double area = 3.14159 * (Math.pow(raio, 2)); // calculando area de um circulo
        System.out.printf("AREA DO CIRCULO = %.4f ", area);

        input.close();

    }

}
