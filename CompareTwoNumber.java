package Mantra;
import java.util.*;
//Compare Two Numbers
//
//Write a Java program to compare two numbers.
//Input Data:
//Input first integer: 25
//Input second integer: 39
//Expected Output
//
//25 != 39
//25 < 39
//25 <= 39
public class CompareTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input first number
        System.out.print("Input first integer: ");
        int a = sc.nextInt();

        // Input second number
        System.out.print("Input second integer: ");
        int b = sc.nextInt();

        // Comparison outputs
        if (a == b) {
            System.out.println(a + " == " + b);
        }
        if (a != b) {
            System.out.println(a + " != " + b);
        }
        if (a < b) {
            System.out.println(a + " < " + b);
        }
        if (a > b) {
            System.out.println(a + " > " + b);
        }
        if (a <= b) {
            System.out.println(a + " <= " + b);
        }
        if (a >= b) {
            System.out.println(a + " >= " + b);
        }
    }
}
