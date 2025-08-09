package exercicios.teste_3;

import exercicios.teste_3.entities.Circle;
import exercicios.teste_3.entities.Rectangle;
import exercicios.teste_3.entities.Shape;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Shape> shapes = new ArrayList<>();

        System.out.print("How many shapes you'll text?   ");
        int x = sc.nextInt();

        for (int i = 1; i <= x; i++) {
            System.out.println("Enter the #" + i + " shape data:");
            System.out.print("Circle or Rectangle (c/r)?     ");
            String type = sc.next();
            if (type.equals("c")) {
                System.out.print("Radius:                        ");
                Double radius = sc.nextDouble();
                shapes.add(new Circle(radius));
            } else if (type.equals("r")) {
                System.out.print("Width:                         ");
                Double width = sc.nextDouble();
                System.out.print("Height:                        ");
                Double height = sc.nextDouble();
                shapes.add(new Rectangle(height, width));
            } else {
                System.out.println("[ERROR] - Invalid Shape!");
            }
        }

        System.out.println("\nTOTAL AREA: ");
        System.out.printf("%.2f\n", totalArea(shapes));

    }

    public static Double totalArea(ArrayList<? extends Shape> list) {
        Double sum = 0.0;
        for(Shape s : list) {
            sum += s.area();
        }
        return sum;
    }


}