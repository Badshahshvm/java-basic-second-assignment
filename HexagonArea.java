package Mantra;
import java.util.*;
//Hexagon Area
//
//Write a Java program to compute hexagon area.
//Area of a hexagon = (6 * s^2)/(4*tan(π/6))
//where s is the length of a side
public class HexagonArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input side length
        System.out.print("Enter the length of the side (s): ");
        double s = sc.nextDouble();

        // Area calculation using the given formula
        double area = (6 * s * s) / (4 * Math.tan(Math.PI / 6));

        // Output
        System.out.printf("The area of the hexagon is: %.4f\n", area);
    }
}
