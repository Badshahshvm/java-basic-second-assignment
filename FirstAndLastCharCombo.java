package Mantra;

public class FirstAndLastCharCombo {
    public static String addFirstAndLastChar(String s1, String s2)
    {


        s1 = s1.trim();
        s2 = s2.trim();


        char first = (s1.length() > 0) ? s1.charAt(0) : '#';


        char last = (s2.length() > 0) ? s2.charAt(s2.length() - 1) : '#';


        return "" + first + last;
    }

    public static void main(String[] args) {
        String s1="shivam";
        String s2="";
        String s3="sonu";
        String s4="anand";
        System.out.println(addFirstAndLastChar(s1,s2));
        System.out.println(addFirstAndLastChar(s3,s4));
    }
}
