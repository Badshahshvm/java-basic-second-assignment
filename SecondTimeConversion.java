package Mantra;
import java.util.*;
//convert seconds into hours
public class SecondTimeConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input seconds: ");
        int totalSeconds = sc.nextInt();

        int hours = totalSeconds / 3600;
        int remainingSeconds = totalSeconds % 3600;

        int minutes = remainingSeconds / 60;
        int seconds = remainingSeconds % 60;

        // Format the output as HH:MM:SS
        System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);

    }
}
