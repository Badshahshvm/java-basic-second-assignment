package Mantra;
import java.util.Scanner;

public class ReversedWord {

    // Entry point
    public static void main(String[] args) {
        String word = "shivam kumar"
        String reversed = reverseWord(word);
        displayReversedWord(reversed);
    }


    public static String reverseWord(String word) {
        char[] characters = word.toCharArray();
        String reversed = "";
        for (int i = characters.length - 1; i >= 0; i--) {
            reversed += characters[i];
        }
        return reversed;
    }

    // Function to display the reversed word
    private static void displayReversedWord(String reversed) {
        System.out.println("Reversed word: " + reversed);
    }
}
