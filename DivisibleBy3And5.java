package Mantra;
//Divisible by 3, 5, Both
//
//Write a Java program to print numbers between 1 and 100 divisible by 3, 5 and both.
public class DivisibleBy3And5 {
    public static  void printNumber(int n)
    {
        for(int i=1;i<=n;i++)
        {
            if(i%3==0 && i%5==0)
            {
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args) {
      printNumber(100);
    }
}
