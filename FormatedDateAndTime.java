package Mantra;
// Formatted Date and Time
//
//Write a Java program to display the current date and time in a specific format.
//Sample Output:
//
//Now: 2017/06/16 08:52:03.066
import java.text.SimpleDateFormat;
import java.util.*;
public class FormatedDateAndTime {
    public static void main(String[] args) {
        // Define the desired date-time format
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");


        Date currentDate = new Date();


        System.out.println("Now: " + formatter.format(currentDate));
    }
}
