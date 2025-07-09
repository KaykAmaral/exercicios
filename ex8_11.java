package exercicios;
import java.util.Objects;
import java.util.Scanner;

public class ex8_11 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantas pessoas você quer digitar?   ");
        int x = teclado.nextInt();

        String[] sexo = new String[x];
        double[] altura = new double[x];

        double maior = 0;
        double menor = 100;
        double somMulheres = 0;
        int qMulheres = 0;
        int qHomens = 0;

        for (int i = 0; i < sexo.length; i++) {
            teclado.nextLine();
            sexo[i] = teclado.nextLine();
            altura[i] = teclado.nextDouble();

            if (altura[i] > maior) { maior = altura[i]; }
            if (altura[i] < menor) { menor = altura[i]; }
            if (Objects.equals(sexo[i], "M")) { qHomens++; }
            if (Objects.equals(sexo[i], "F")) {
                somMulheres += altura[i];
                qMulheres++;
            }

        }

        System.out.printf("MAIOR ALTURA:     %.2f\n" + maior );
        System.out.printf("MENOR ALTURA:     %.2f\n" + menor );
        System.out.printf("MÉDIA MULHERES:   %.2f\n", (somMulheres / qMulheres) );
        System.out.println("N° DE HOMENS:     " + qHomens );


    }

}