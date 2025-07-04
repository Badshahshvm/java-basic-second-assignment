package Mantra;
//Write a Java program to extract the first half of a even string.
//Test Data: Python
//Sample Output:
//
//Pyt
public class ExtractHalf {
    public static String extractString(String s1)
    {
        String result=s1.substring(0,s1.length()/2);
        return result;
    }

    public static void main(String[] args) {
        String s1="shivam";
        System.out.println(extractString(s1));
    }
}
