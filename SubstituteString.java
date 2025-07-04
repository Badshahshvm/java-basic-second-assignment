package Mantra;

public class SubstituteString {

    public static String substituteFirstThreeChar(String s1) {
        s1 = s1.trim();  // Remove leading/trailing whitespace
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            if (i < s1.length()) {
                result.append(s1.charAt(i));
            } else {
                result.append('#');
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s1 = "an";
        System.out.println(substituteFirstThreeChar(s1));
    }
}
