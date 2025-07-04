package Mantra;
//Write a Java program to calculate the modules of two numbers without using any inbuilt modulus operator.
//Sample Output:
//
//Input the first number : 19
//Input the second number: 7
//5
public class ModulusOfTwoNumber {
    public static  int moduloOfTwoNumber(int a, int b)
    {
        int quotient = a / b;
        int product = quotient * b;
        int remainder = a - product;
        return remainder;

    }

    public static void main(String[] args) {
        System.out.println(moduloOfTwoNumber(19,7));
    }
}
