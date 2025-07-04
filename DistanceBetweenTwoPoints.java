package Mantra;
import java.util.*;
public class DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input latitude and longitude in degrees
        System.out.print("Enter latitude of point 1 (x1): ");
        double x1 = Math.toRadians(sc.nextDouble());

        System.out.print("Enter longitude of point 1 (y1): ");
        double y1 = Math.toRadians(sc.nextDouble());

        System.out.print("Enter latitude of point 2 (x2): ");
        double x2 = Math.toRadians(sc.nextDouble());

        System.out.print("Enter longitude of point 2 (y2): ");
        double y2 = Math.toRadians(sc.nextDouble());

        // Radius of Earth
        double r = 6371.01;

        // Distance formula
        double d = r * Math.acos(Math.sin(x1) * Math.sin(x2) +
                Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));

        // Output the result
        System.out.printf("The distance between the two points is: %.2f km\n", d);
    }
}
