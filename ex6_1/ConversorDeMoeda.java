package exercicios.ex6_1;
public class ConversorDeMoeda {

    public static double converter(double moeda, double quantidade) {
        return moeda * quantidade + (moeda * quantidade * 0.06);
    }

}
