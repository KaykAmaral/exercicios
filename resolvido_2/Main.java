package exercicios.resolvido_2;

import exercicios.resolvido_2.entities.Circle;
import exercicios.resolvido_2.entities.Rectangle;
import exercicios.resolvido_2.entities.Shape;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Shape> shapes = new ArrayList<>();

        System.out.print("Enter the number of shapes:     ");
        int x = sc.nextInt();
        for (int i = 1; i <= x; i++) {
            System.out.println("Shape #" + i + " data:");
            System.out.print("Rectangle or circle (r/c)?      ");
            String shape = sc.next();
            System.out.print("Color (BLACK/BLUE/RED):         ");
            String color = sc.next();

            if (shape.equals("r")) {
                System.out.print("Width:                          ");
                double width = sc.nextDouble();
                System.out.print("Height:                         ");
                double height = sc.nextDouble();
                shapes.add(new Rectangle(width, height, color));
            } else if (shape.equals("c")) {
                System.out.print("Radius:                         ");
                double radius = sc.nextDouble();
                shapes.add(new Circle(radius, color));
            } else { i--; }

        }

        System.out.println();
        System.out.println("AREAS:");

        for (Shape shp : shapes) { System.out.printf("%.2f\n", shp.area()); }

        sc.close();

    }

}
