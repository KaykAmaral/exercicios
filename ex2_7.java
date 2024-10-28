package exercicios;
import java.util.Scanner;

public class ex2_7 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("digite o valor de X:");
        float x = input.nextFloat();
        System.out.print("digite o valor de Y:");
        float y = input.nextFloat();

        if (x == 0 && y == 0){
            System.out.println("LOCAL: Origem");
        } else if (x == 0 || y == 0) {
            if (x == 0){
                System.out.println("LOCAL: EixoX");
            } else {
                System.out.println("LOCAL: EixoY");
            }
        } else if (x > 0) { // X positivo
            if (y > 0) {
                System.out.println("LOCAL: Q1");
            } else {
                System.out.println("LOCAL: Q4");
            }
        } else { // X negativo
            if (y > 0) {
                System.out.println("LOCAL: Q2");
            } else {
                System.out.println("LOCAL: Q3");
            }
        }

        input.close();

    }
}
