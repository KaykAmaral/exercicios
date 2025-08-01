package exercicios.ex15_1;

import exercicios.ex15_1.entities.Pessoa;
import exercicios.ex15_1.entities.PessoaFisica;
import exercicios.ex15_1.entities.PessoaJuridica;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        System.out.print("Enter the number of tax payers:     ");
        int x = sc.nextInt();

        for (int i = 1; i <= x; i++) {
            System.out.print("Individual or company (i/c)?    ");
            String type = sc.next();
            System.out.print("Name:                           ");
            String name = sc.next();
            System.out.print("Annual Income:                  ");
            double annualincome = sc.nextDouble();

            if (type.equals("i")) {
                System.out.print("Health expenditures:            ");
                double healthExpenditures = sc.nextDouble();
                pessoas.add(new PessoaFisica(name, annualincome, healthExpenditures));
            } else if (type.equals("c")) {
                System.out.print("Number of employyes:            ");
                int numEmployees = sc.nextInt();
                pessoas.add(new PessoaJuridica(name, annualincome, numEmployees));
            } else { i--; }

        }

        System.out.println();
        System.out.println("TAXES PAID:");

        for (Pessoa p : pessoas) {
            p.toString();
        }

    }

}
