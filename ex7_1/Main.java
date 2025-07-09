package exercicios.ex7_1;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        String resp;

        System.out.println("[Titular]   [n°Conta]");
        Conta conta = new Conta(teclado.nextLine(), teclado.nextInt());

        System.out.print("Deseja depositar na abertura da conta?  [s/n]   ");
        resp = teclado.next();

        if (Objects.equals(resp, "s")) { conta.depositar(teclado.nextFloat()); }

        conta.toString();

        System.out.print("DEPOSITO:  ");
        conta.depositar(teclado.nextFloat());
        System.out.print("SACAR:     ");
        conta.sacar(teclado.nextFloat());

        conta.toString();

        teclado.close();

    }

}
