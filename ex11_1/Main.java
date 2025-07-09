package exercicios.ex11_1;
import exercicios.ex11_1.entities.Account;
import exercicios.ex11_1.model.Exceptions.AccountException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("[HOLDER] [NUMBER] [BALANCE] [WITHDRAW LIMIT]");

            Account ac1 = new Account(sc.nextLine(), sc.nextInt(), sc.nextDouble(), sc.nextDouble());

            System.out.print("Enter deposit value:   ");
            double deposit = sc.nextDouble();
            ac1.deposit(deposit);
            double withdraw = sc.nextDouble();
            ac1.withdraw(withdraw);

            System.out.println(ac1);

        } catch (AccountException e) {
            System.out.println("[ERROR] - " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("[EEROR] - Invalid input");
        }

        sc.close();
    }

}
