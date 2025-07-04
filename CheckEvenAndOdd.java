package Mantra;
//49. Check Even or Odd
//
//Write a Java program to accept a number and check whether the number is even or not. Prints 1 if the number is even or 0 if odd.
//Sample Output:
//
//Input a number: 20
//1
public class CheckEvenAndOdd {
    public static void isCheckOddAndEven(int n)
    {
        if(n%2==0)
        {
            System.out.println(1);
        }
        System.out.println(0);
    }

    public static void main(String[] args) {
        isCheckOddAndEven(23);
    }

}
