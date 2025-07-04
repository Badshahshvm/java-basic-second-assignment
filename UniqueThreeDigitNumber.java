package Mantra;
import java.util.*;
//39. Unique Three-Digit Numbers
//
//Write a Java program to create and display a unique three-digit number using 1, 2, 3, 4. Also count how many three-digit numbers are there.
public class UniqueThreeDigitNumber {
    public static void main(String[] args) {
        int count = 0;

        System.out.println("Unique three-digit numbers using 1, 2, 3, 4:");


        for (int i = 1; i <= 4; i++) {

            for (int j = 1; j <= 4; j++) {

                for (int k = 1; k <= 4; k++) {
                    // Ensure all digits are different
                    if (i != j && j != k && i != k) {
                        System.out.println(i * 100 + j * 10 + k);
                        count++;
                    }
                }
            }
        }

        System.out.println("Total unique three-digit numbers: " + count);
    }

}
