package Mantra;
// Compute n+nn+nnn
//
//Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn.
//Sample Output:
//
//Input number: 5
//5 + 55  + 555
import java.util.*;
public class Commulate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Input number: ");
        int n = sc.nextInt();


        String nn = Integer.toString(n) + Integer.toString(n);     // e.g., "5" + "5" = "55"
        String nnn = nn + Integer.toString(n);                     // e.g., "55" + "5" = "555"

        int total = n + Integer.parseInt(nn) + Integer.parseInt(nnn);

        // Display
        System.out.println(n + " + " + nn + " + " + nnn + " = " + total);
    }
}
