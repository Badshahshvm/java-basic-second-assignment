package Mantra;

public class CommonDigitInAnumber {
    public static boolean commonDigitInAnumberOf(int a, int b)
    {

        int aFirst = a / 10;
        int aLast = a % 10;


        int bFirst = b / 10;
        int bLast = b % 10;

        // Check for common digits
        return (aFirst == bFirst || aFirst == bLast || aLast == bFirst || aLast == bLast);
    }

    public static void main(String[] args) {
        System.out.println(commonDigitInAnumberOf(25,15));
    }
}
