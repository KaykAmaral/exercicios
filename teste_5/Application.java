package exercicios.teste_5;

import exercicios.teste_5.entities.Client;

public class Application {

    public static void main(String[] args) {

        Client c1 = new Client("Kayk", "123-45-6789");
        Client c2 = new Client("Martha", "456-88-7511");
        Client c3 = new Client("Kayk", "123-45-6789");

        String s1 = "test";
        String s2 = "test";
        String s3 = new String("test");
        String s4 = new String("test");

        // Tests with '==':
        System.out.println("TESTS WITH '==':");
        System.out.println(s1 == s2); // True
        System.out.println(s2 == s3); // False
        System.out.println(s3 == s4); // False
        System.out.println(c1 == c2); // False
        System.out.println(c1 == c3); // False

        /*
            Why'd the c1 aren't equal to c3?
            Cause using '==' you're catting the  Object's address code and comparing this, not the content inside
            The same thing about s3 and s4
            So... s1 is equals s2, because they've a special treatment and they aren't considered an object
         */

        // Test with '.equals()'
        System.out.println("\nTESTS WITH '.equals()'");
        System.out.println(s1.equals(s2)); // True
        System.out.println(s2.equals(s3)); // True
        System.out.println(s3.equals(s4)); // True
        System.out.println(c1.equals(s2)); // False
        System.out.println(c1.equals(c3)); // True

        /*
            The equals method compare the contend inside the objects
         */

        // Tests with hashcode:
        System.out.println("\nTESTS WITH 'hashcode':");

        System.out.println(c1.hashCode()); // 1668029586
        System.out.println(c2.hashCode()); // -1733444430
        System.out.println(c3.hashCode()); // 1668029586
        System.out.println(s1.hashCode()); // 3556498
        System.out.println(s2.hashCode()); // 3556498
        System.out.println(s3.hashCode()); // 3556498
        System.out.println(s4.hashCode()); // 3556498

        /*
            The hashcode are generated using the Object's content inside itself
         */

    }

}