
//Write a Java program to associate the specified value with the specified key in a HashMap. [Hint:Create HashMap and store f//ew elements on it] 
package MapLab;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap
        Map<Integer, String> hashMap = new HashMap<>();

        // Store elements in the HashMap
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");

        // Display the HashMap before adding a new element
        System.out.println("HashMap before adding: " + hashMap);

        // Associate a new value with a specified key
        int keyToAdd = 4;
        String valueToAdd = "Four";
        hashMap.put(keyToAdd, valueToAdd);

        // Display the HashMap after adding the new element
        System.out.println("HashMap after adding: " + hashMap);
    }
}
