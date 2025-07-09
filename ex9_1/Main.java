package exercicios.ex9_1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        /*  Estou aprendendo sobre listas
            Esse programa recebe id, nome
            e salario de um funcionario
            pede o id de um funcionario e
            da um aumento para ele, caso o id
            for inexistente, o programa encerra
        */


        Scanner teclado = new Scanner(System.in);
        List<Empregado> empregado = new ArrayList<>();

        System.out.print("Quantos empregados serão digitados?   ");
        int x = teclado.nextInt();

        System.out.println("[ID] --- [NOME] --- [SALARIO]");

        for (int i = 0; i < x; i++) {
            teclado.nextLine();
            Integer id = teclado.nextInt();
            teclado.nextLine();
            String nome = teclado.nextLine();
            Double salario = teclado.nextDouble();

            Empregado emp = new Empregado(id, nome, salario);

            empregado.add(emp);

            System.out.println("---------------------------");

        }

        System.out.println();


        System.out.print("Qual o ID do funcionario que vai receber um aumento?   ");
        int y = teclado.nextInt();

        int auxiliar = 0; // Vai me dizer se há um funcionário com X ID

        for (int i = 0; i < x; i++) {
            if (empregado.get(i).id == y) {
                System.out.print("Digite a % de aumento de salario:   ");
                int porcent = teclado.nextInt();
                empregado.get(i).aumentarSalario(porcent);
                auxiliar++;
            }
        }

        if (auxiliar == 0) {
            System.out.println("[ERRO] --- ID Inexistente");
        }


        System.out.println();

        for(Empregado e : empregado) { e.toString(); }



    }

}