package exercicios;
import java.util.Scanner;

public class Ex1_4 {

    public static void main (String[] args) {

        // Declaração das variaveis e criação do Scanner
        Scanner input = new Scanner(System.in);
        int funcionario, horas;
        double valorHoras, salario;

        // Atribuindo valor as variaveis
        System.out.print("Indique o ID do funcionario: ");
        funcionario = input.nextInt();
        System.out.print("Indique as horas trabalhadas: ");
        horas = input.nextInt();
        System.out.print("Indique o valor das horas: ");
        valorHoras = input.nextDouble();
        salario = valorHoras * horas;

        // Saida dos dados
        System.out.println("NºFuncionário: " + funcionario);
        System.out.printf("R$%.2f", salario);

        input.close();

    }

}
