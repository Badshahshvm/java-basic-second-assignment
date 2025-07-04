package Mantra;
//46. Display System Time
//
//Write a Java program to display system time.
//Sample Output:
//
//Current Date time: Fri Jun 16 14:17:40 IST 2017
import java.util.*;
public class DisplaySystemTime {
    public static void main(String[] args) {
        Date currentDate = new Date();

        // Display it
        System.out.println("Current Date time: " + currentDate);
    }
}
