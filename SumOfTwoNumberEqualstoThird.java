package Mantra;

public class SumOfTwoNumberEqualstoThird {
    public static boolean sumOfTwoNumberIsEqualsToThird(int a, int b, int c)
    {
        if(a+b==c || b+c==a || c+a==b)
        {
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        int a=5;
        int b=10;
        int c=25;
        System.out.println(sumOfTwoNumberIsEqualsToThird(a,b,c));
    }
}
