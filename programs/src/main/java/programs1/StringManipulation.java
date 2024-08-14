package programs1;

import java.sql.SQLOutput;

public class StringManipulation {
    public static void main(String[] args) {
        String str = "Hello";
        str = str + " World";
        String input = "Dh@a!rm";
        System.out.println(str);

        // Remove special symbols
        String cleanedString = input.replaceAll("[^a-zA-Z0-9]", "");

        // Reverse the cleaned string
        String reversedString = new StringBuffer(cleanedString).reverse().toString();

        System.out.println("Original String: " + input);
        System.out.println("Cleaned String: " + cleanedString);
        System.out.println("Reversed String: " + reversedString);
    }
}