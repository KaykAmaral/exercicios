package exercicios.ex13_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        String readerPath = "C:\\Users\\kaykd\\Desktop\\UDEMY\\JAVA\\WS-INTELIJ\\exercicios\\ex13_1\\filesCSV\\in.csv";
        String writerPath = "C:\\Users\\kaykd\\Desktop\\UDEMY\\JAVA\\WS-INTELIJ\\exercicios\\ex13_1\\filesCSV" +
                "\\summary.csv";

        List<Product> list = new ArrayList<>(); // Cada lugar da lista armazena um objeto "Product"

        try (BufferedReader br = new BufferedReader(new FileReader (readerPath))) {

            // Tudo isso para ler e armazenar os valores do arquivo CSV

            String itemCSV = br.readLine();
            while (itemCSV != null) {
                String[] fields = itemCSV.split(",");
                String name = fields[0];
                double price = Double.parseDouble(fields[1]);
                int quantity = Integer.parseInt(fields[2]);

                list.add(new Product(name, price, quantity));

                itemCSV = br.readLine();

            }

            // Fazendo outro try dentro de outro try, porque acho que vai ficar mais legivel assim
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(writerPath))) {

                for (Product item : list) {
                    bw.write(item.getName() + "," + String.format("%.2f", item.total()));
                    bw.newLine();
                }

            }


        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

    }

}