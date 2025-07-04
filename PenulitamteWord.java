package Mantra;
//Find Penultimate Word
import java.util.*;
public class PenulitamteWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a String: ");
        String input = sc.nextLine();

        String[] words = input.trim().split("\\s+");
        if (words.length >= 2) {
            System.out.println("Penultimate word: " + words[words.length - 2]);
        } else {
            System.out.println("Not enough words in the sentence.");
        }
    }
}
