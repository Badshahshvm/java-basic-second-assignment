package Mantra;
//Write a Java program to insert a word in the middle of another string.
//Insert "Tutorial" in the middle of "Python 3.0", so the result will be Python Tutorial 3.0.
//Sample Output:
//
//Python Tutorial 3.0
public class InsertWordInMiddle {
    public static void main(String[] args) {
        String s1 = "Python 3.0";
        String s2 = "Tutorial";


        int space = s1.indexOf(" ");


        if (space != -1) {
            String result = s1.substring(0, space) + " " + s2 + s1.substring(space);
            System.out.println(result);
        }
    }
}
