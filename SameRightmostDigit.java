package Mantra;
import java.util.*;
public class SameRightmostDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input three non-negative integers
        System.out.print("Input the first number : ");
        int a = sc.nextInt();

        System.out.print("Input the second number: ");
        int b = sc.nextInt();

        System.out.print("Input the third number : ");
        int c = sc.nextInt();

        // Extract rightmost digits
        int aLast = a % 10;
        int bLast = b % 10;
        int cLast = c % 10;

        // Check if any two or more rightmost digits are the same
        boolean result = (aLast == bLast) || (aLast == cLast) || (bLast == cLast);

        // Output
        System.out.println("The result is: " + result);
    }
}
