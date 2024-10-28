package exercicios;
import java.util.Scanner;
public class ex4_6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        if (x > 0) {

            for (int i = 1; i <= x; i++) {
                if (x % i == 0) {
                    System.out.println(i);
                }
            }

        }

        input.close();

    }

}