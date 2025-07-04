package Mantra;

public class PrintOddNumber {
    public static void printOddNumberInRange(int n)
    {
        for(int i=1;i<=n;i++)
        {
            if(i%2!=0)
            {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        printOddNumberInRange(99);
    }
}
