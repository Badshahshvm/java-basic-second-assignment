package Mantra;
//Count Factors
public class CountFactors {
    public static int countFactors(int n)
    {
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countFactors(25));
    }
}
