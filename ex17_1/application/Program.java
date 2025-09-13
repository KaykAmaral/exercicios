package exercicios.ex17_1.application;

import exercicios.ex17_1.entities.Student;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Set<Student> set = new HashSet<>();

        System.out.print("how many students in course A:  ");
        int x = sc.nextInt();
        for (int i = 0; i < x; i++) {
            System.out.print((i+1) + "# Student code:  ");
            int code = sc.nextInt();
            set.add(new Student(code));
        }

        System.out.print("how many students in course B:  ");
        x = sc.nextInt();
        for (int i = 0; i < x; i++) {
            System.out.print((i+1) + "# Student code:  ");
            int code = sc.nextInt();
            set.add(new Student(code));
        }

        System.out.print("how many students in course C:  ");
        x = sc.nextInt();
        for (int i = 0; i < x; i++) {
            System.out.print((i+1) + "# Student code:  ");
            int code = sc.nextInt();
            set.add(new Student(code));
        }

        System.out.println("\nTotal Students: " + set.size());

    }

}