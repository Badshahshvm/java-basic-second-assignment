package Mantra;
//70. Short + Long + Short String
//
//Write a Java program to create a string in the form of short_string + long_string + short_string from two strings. The strings must not have the same length.
//Test Data: Str1 = Python
//Str2 = Tutorial
public class ShortLong {
    public static String concatShortLongShort(String s1,String s2)
    {
        String result="";
      if(s1.length()!=s2.length())
      {
          if(s1.length()>s2.length())
          {
              result=s2+s1+s2;
          }
          else {
              result=s1+s2+s1;
          }
      }
      return result;
    }

    public static void main(String[] args) {
        String s1="shiv";
        String s2="shakti";
        System.out.println(concatShortLongShort(s1,s2));
    }
}
