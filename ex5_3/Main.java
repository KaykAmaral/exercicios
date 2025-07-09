package exercicios.ex5_3;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Programa que le as 3 notas que um aluno tirou no semestre e mostra se ele está aprovado ou não

        Scanner input = new Scanner(System.in);

        Aluno a1 = new Aluno(input.nextLine(), input.nextFloat(), input.nextFloat(), input.nextFloat());
        a1.toString();

        input.close();

    }

}