package exercicios.ex17_2.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Program {

    public static void main(String[] args) {

        String path = "/home/kayaqui/Desktop/JAVA/exercicios/ex17_2/archive/in.txt";


        Map<String, Integer> candidate = new TreeMap<>();

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {


            String line = br.readLine();

            while(line != null) {
                String[] fields = line.split(",");
                line = br.readLine();
                if (candidate.containsKey(fields[0])) {
                    Integer votes = candidate.get(fields[0]) + Integer.parseInt(fields[1]);
                    candidate.put(fields[0], votes);
                } else {
                    candidate.put(fields[0], Integer.parseInt(fields[1]));
                }

            }

        } catch (IOException e) {
            System.out.println("ERROR --- " + e.getMessage());
        }

        System.out.println("\nCANDIDATES:");

        for(String c : candidate.keySet()) {
            System.out.println(c + ": " + candidate.get(c));
        }

    }

}