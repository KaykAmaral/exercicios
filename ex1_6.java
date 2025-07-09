package exercicios;
import java.util.Scanner;

public class ex1_6 {

    public static void main(String[] args) {

        // programa que le 3 variaveis e informa a area do triangulo, circulo, trapezio, quadrado e retangulo

        Scanner input = new Scanner(System.in);
        float a, b, c;
        double triangulo, circulo, trapezio, quadrado, retangulo;
        System.out.println("Digite o valor de A B e C");
        a = input.nextFloat();
        b = input.nextFloat();
        c = input.nextFloat();

        triangulo = (a*c) / 2;
        circulo = 3.14159 * Math.pow(c,2);
        trapezio = ((a + b) * c) / 2;
        quadrado = Math.pow(b,2);
        retangulo = a * b;

        System.out.printf("TRIANGULO = %.2f\n", triangulo);
        System.out.printf("CIRCULO   = %.2f\n", circulo);
        System.out.printf("TRAPEZIO  = %.2f\n", trapezio);
        System.out.printf("QUADRADO  = %.2f\n", quadrado);
        System.out.printf("RETANGULO = %.2f", retangulo);

        input.close();

    }
}
