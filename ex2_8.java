package exercicios;
import java.util.Scanner;
public class ex2_8 {

    public static void main(String[] args) {

        // Programa que le o salario de alguem e calcula a % de imposto que devera ser pago

        Scanner input = new Scanner(System.in);
        double salario;
        double imposto = 0;
        int porcentagem = 0;

        System.out.print("Informe o salario:    R$");
        salario = input.nextFloat();

        if (salario <= 0) {
            System.out.println("Salario não pode ser nulo ou negativo");
        } else {
            if (salario <= 2000) {
                imposto = 0;
            } else if (salario <= 3000){
                imposto = (salario-2000) * 0.08;
                porcentagem = 8;
            } else if (salario <= 4500) {
                imposto = ((salario-3000) * 0.18) + 80;
                porcentagem = 18;
            } else {
                imposto = ((salario - 4500) * 0.28) + 80 + (1500 * 0.18);
                porcentagem = 28;
            }
        }

        System.out.printf("IMPOSTO:  %d \nTOTAL A PAGAR: %.2f",porcentagem, imposto);

        input.close();

    }

}
