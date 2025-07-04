package Mantra;
import java.util.*;
//Largest And Smallest Value
public class LaegestAndSmallestValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int a = sc.nextInt();

        System.out.print("Input the second number: ");
        int b = sc.nextInt();

        int result;
        if (a == b) {
            result = 0;
        } else if (a % 6 == b % 6) {
            result = Math.min(a, b);
        } else {
            result = Math.max(a, b);
        }

        System.out.println("Result: " + result);
    }
}
