package exercicios;
import java.util.Scanner;
public class ex4_2 {

    public static void main(String[] args) {

        // Programa que le varios n°s e mostra a quantidade de n°s que estava entre e fora do intevalo 10---20

        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int n;
        int in = 0;
        int out = 0;
        for (int i = 0; i < x; i++) {
            n = input.nextInt();
            if (n <= 20 && n >= 10) { in++; } else { out ++; }
        }
        System.out.printf("INTERVALO [10 --- 20] \n IN = %d \n OUT = %d", in, out);

        input.close();

    }

}
