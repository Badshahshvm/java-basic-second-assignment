package Mantra;

public class CountFactorDivisibleByP {
    public static int countFactors(int a, int b, int p)
    {
        int count=0;
        for(int i=a;i<=b;i++)
        {
            if(i%p==0)
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int a=6;
        int b=20;
        int p=6;
        System.out.println(countFactors(a,b,p));
    }
}
