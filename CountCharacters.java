package Mantra;
//38. Count Characters in String
//
//Write a Java program to count letters, spaces, numbers and other characters in an input string.
//Expected Output
//
//The string is :  Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33
//letter: 23
//space: 9
//number: 10
//other: 6
import java.util.*;
public class CountCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String s1 = sc.nextLine();

        int s2 = 0; // letter count
        int s3 = 0; // space count
        int s4 = 0; // number count
        int s5 = 0; // other characters count

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);

            if (Character.isLetter(ch)) {
                s2++;
            } else if (Character.isDigit(ch)) {
                s4++;
            } else if (Character.isWhitespace(ch)) {
                s3++;
            } else {
                s5++;
            }
        }

        System.out.println("letter: " + s2);
        System.out.println("space: " + s3);
        System.out.println("number: " + s4);
        System.out.println("other: " + s5);
    }
}
