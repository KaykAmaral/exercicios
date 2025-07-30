package exercicios.resolvido_1;

import java.util.Locale;
import java.util.Scanner;
import exercicios.resolvido_1.entities.Employee;
import exercicios.resolvido_1.entities.OutsourcedEmployee;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int x = sc.nextInt();

        for (int i = 1; i <= x; i++) {
            System.out.println("Employee #" + i + ":");
            System.out.print("Outsourced? (y/n): ");
            String outsourced = sc.next();
            System.out.print("Name:              ");
            String name = sc.next();
            System.out.print("Hours:             ");
            int hours = sc.nextInt();
            System.out.print("Value per Hour:    ");
            double valuePerHour = sc.nextDouble();

            if (outsourced.equals("y")) {
                System.out.print("Adittional Charge: ");
                double adittionalCharge = sc.nextDouble();
                employees.add(new OutsourcedEmployee(name, hours, valuePerHour, adittionalCharge));
            } else {
                employees.add(new Employee(name, hours, valuePerHour));
            }


        }

        System.out.println();
        System.out.println("PAYMENTS:");

        for (Employee e : employees) { System.out.println(e.toString()); }

        sc.close();

    }

}