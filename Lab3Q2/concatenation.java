package Lab3Q2;
import java.util.*;

public class concatenation {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("I");
        strings.add("am");
        strings.add("Anurag..");
       //below print statement prints list of strings
        System.out.println("List of strings: " + strings);
        //reduce() is use for concate the all string available in above list
        String concatenatedString = strings.stream()
                                           .reduce("", String::concat);

        System.out.println("Concatenated string: " + concatenatedString);
    }
}

