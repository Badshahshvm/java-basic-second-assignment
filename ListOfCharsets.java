import java.nio.charset.Charset;
import java.util.SortedMap;

public class ListOfCharsets {
    public static void main(String[] args) {
        // Get all available character sets
        SortedMap<String, Charset> charsets = Charset.availableCharsets();

        System.out.println("List of available character sets:");

        // Print each charset name
        for (String charsetName : charsets.keySet()) {
            System.out.println(charsetName);
        }
    }
}
