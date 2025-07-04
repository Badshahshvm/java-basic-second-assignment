package Mantra;
import java.util.*;
//Polygon Area
//
//Write a Java program to compute the area of a polygon.
//Area of a polygon = (n*s^2)/(4*tan(π/n))
//where n is n-sided polygon and s is the length of a side
public class PolygonArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of sides
        System.out.print("Enter the number of sides (n): ");
        int n = sc.nextInt();

        // Input length of a side
        System.out.print("Enter the length of each side (s): ");
        double s = sc.nextDouble();

        // Area formula
        double area = (n * s * s) / (4 * Math.tan(Math.PI / n));

        // Output
        System.out.printf("The area of the polygon is: %.4f\n", area);
    }
}
