package exercicios.ex18_1.Program;

import exercicios.ex18_1.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        List<Employee> employeeList = new ArrayList<>();

        // /home/kayaqui/Desktop/JAVA/exercicios/ex18_1/csvFile/in.csv
        System.out.print("Enter the file path: ");
        String path = sc.nextLine();

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                employeeList.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }

            System.out.print("Enter Salary: ");
            Double sal = sc.nextDouble();

            // Getting emails for each Employee whose salary in more than sal variable
            List<String> email = employeeList.stream()
                    .filter(e -> e.getSalary() > sal)
                    .map(e -> e.getEmail())
                    .sorted()
                    .toList();

            System.out.println("Emails of people whose salary is more than $" + String.format("%.2f", sal));

            // Showing emails
            for (String s : email) { System.out.println(s); }

            Double sum = employeeList.stream()
                    .filter(e -> e.getName().startsWith("M"))
                    .map(e -> e.getSalary())
                    .reduce(0.0, (x,y) -> x + y);

            System.out.println("Sum of salary from people whose name starts with 'M': " + String.format("%.2f", sum));

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}