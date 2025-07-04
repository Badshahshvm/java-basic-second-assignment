//Hexadecimal to Octal Converterimport java.util.Scanner;

public class HexToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input hexadecimal number
        System.out.print("Enter a hexadecimal number: ");
        String hex = sc.nextLine();

        try {
            // Convert hexadecimal to decimal
            int decimal = Integer.parseInt(hex, 16);

            // Convert decimal to octal
            String octal = Integer.toOctalString(decimal);

            // Output
            System.out.println("Octal equivalent: " + octal);
        } catch (NumberFormatException e) {
            System.out.println("Invalid hexadecimal input!");
        }
    }
}
