package Mantra;
//Write a Java program that accepts three integers from the user. It returns true if the second number is higher than the first number and the third number is larger than the second number. If "abc" is true, the second number does not need to be larger than the first number.
public class NumberComparisonLogic {
    public static boolean compareLogic(int a, int b, int c)
    {
        if(a>c &&b>c)
        {
            return  true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(compareLogic(8,9,10));
    }
}
