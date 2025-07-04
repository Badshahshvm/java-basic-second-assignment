package Mantra;
import java.util.*;
//Check Substraction Difference
public class CheckSubstractionDefference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int a = sc.nextInt();

        System.out.print("Input the second number: ");
        int b = sc.nextInt();

        System.out.print("Input the third number : ");
        int c = sc.nextInt();

        boolean result = Math.abs(a - b) >= 20 || Math.abs(b - c) >= 20 || Math.abs(a - c) >= 20;
        System.out.println(result);
    }
}
