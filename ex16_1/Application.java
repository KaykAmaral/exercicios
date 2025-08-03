package exercicios.ex16_1;

import exercicios.ex16_1.entities.Contract;
import exercicios.ex16_1.entities.Installment;
import exercicios.ex16_1.services.ContractService;
import exercicios.ex16_1.services.PaypalService;

import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER THE CONTRACT DATAS:");
        System.out.print("Number                   ");
        int number = sc.nextInt();
        System.out.print("Date (dd/MM/yyyy):       ");
        String stringDate = sc.next();
        LocalDate date = LocalDate.parse(stringDate, fmt);
        System.out.print("Value of Contract:       ");
        double totalValue = sc.nextDouble();
        System.out.print("Number of Installments:  ");
        int installments = sc.nextInt();

        Contract contract = new Contract(number, date, totalValue);

        ContractService cs = new ContractService(new PaypalService());
        cs.processContract(contract, installments);

        System.out.println("\nINSTALLMENTS:");

        contract.getInstallment();

    }

}