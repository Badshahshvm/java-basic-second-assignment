package Mantra;

public class RemoveAndContact {
    public static String removeAndConcatStribgs(String s1, String s2)
    {
        String result="";

        if (s1.length() >= 1 && s2.length() >= 1) {
            // Remove the first character and concatenate
            result = s1.substring(1) + s2.substring(1);

        }
        return result;
    }

    public static void main(String[] args) {
        String s1="Pyhton";
        String s2="java";
        System.out.println(removeAndConcatStribgs(s1,s2));
    }
}
