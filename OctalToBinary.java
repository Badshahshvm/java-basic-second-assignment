//Octal to Binary Converter

//Write a Java program to convert a octal number to a binary number.
import java.util.Scanner;

public class OctalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input octal number
        System.out.print("Enter an octal number: ");
        String octal = sc.nextLine();

        try {
            // Convert octal to decimal
            int decimal = Integer.parseInt(octal, 8);

            // Convert decimal to binary
            String binary = Integer.toBinaryString(decimal);

            // Output
            System.out.println("Binary equivalent: " + binary);
        } catch (NumberFormatException e) {
            System.out.println("Invalid octal input!");
        }
    }
}
