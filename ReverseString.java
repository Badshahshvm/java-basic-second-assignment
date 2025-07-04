package Mantra;
import java.util.*;
//37. Reverse a String
//
//Write a Java program to reverse a string.
//Input Data:
//Input a string: The quick brown fox
//Expected Output
public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input the string
        System.out.print("Input a string: ");
        String str = input.nextLine();

        // Convert to character array
        char[] chars = str.toCharArray();

        // Reverse using loop
        String reversed = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            reversed += chars[i];
        }

        // Output the reversed string
        System.out.println("Reversed string: " + reversed);

    }
}
