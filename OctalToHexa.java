//Octal to Hexadecimal Converter

//Write a Java program to convert a octal number to a hexadecimal number.
import java.util.Scanner;

public class OctalToHex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input octal number as string
        System.out.print("Enter an octal number: ");
        String octal = sc.nextLine();

        try {
            // Convert octal to decimal
            int decimal = Integer.parseInt(octal, 8);

            // Convert decimal to hexadecimal
            String hex = Integer.toHexString(decimal).toUpperCase();

            // Output
            System.out.println("Hexadecimal equivalent: " + hex);
        } catch (NumberFormatException e) {
            System.out.println("Invalid octal input!");
        }
    }
}
