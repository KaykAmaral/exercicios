package exercicios;
import java.util.Scanner;
public class ex3_3 {

    public static void main(String[] args) {

        // Programa que le varios numeros de 1---4 e exibe a q° de vezes que foi digitado 1, 2 e 3

        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (x != 4) {

            switch (x) {
                case 1:
                    alcool++; break;
                case 2:
                    gasolina++; break;
                case 3:
                    diesel++; break;
            }

            x = input.nextInt();

        }

        System.out.printf("OBRIGADO! \nAlcool: %d\nGasolina: %d\nDiesel: %d", alcool, gasolina, diesel);

        input.close();

    }

}