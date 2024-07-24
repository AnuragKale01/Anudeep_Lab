package MapLab;
//.Write a program in Java to create a Map Interface where we can store the cricketer name in it along with his scores and search for the batsman name and display his score. [Hint:use containsKey() method to search batsman name] 
import java.util.HashMap;
import java.util.Map;

public class CricketerScores {
    public static void main(String[] args) {
        // Create a Map to store cricketer names and scores
        Map<String, Integer> cricketerScores = new HashMap<>();

        // Add cricketer names and scores to the Map
        cricketerScores.put("Virat Kohli", 70);
        cricketerScores.put("Rohit Sharma", 85);
        cricketerScores.put("Kane Williamson", 55);
        cricketerScores.put("Joe Root", 62);

        // Search for a batsman by name
        String batsmanName = "Rohit Sharma";
        if (cricketerScores.containsKey(batsmanName)) {
            int score = cricketerScores.get(batsmanName);
            System.out.println(batsmanName + "'s score is: " + score);
        } else {
            System.out.println("Batsman not found in the records.");
        }
    }
}
