package Mantra;
import java.util.*;
//Reverse Word
public class ReversedWod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a word: ");
        String input = sc.nextLine();

        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println("Reverse word: " + reversed);
    }
}
