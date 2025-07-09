package exercicios.ex5_1;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        // programa que le a altura e a largura de um retangulo e mostra o seu perimetro, diagonal e area

        Scanner input = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();

        retangulo.setAltura(input.nextInt());
        retangulo.setLargura(input.nextInt());

        retangulo.toString();


    }

}