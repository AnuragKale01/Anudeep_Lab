/* Write a program to reverse a given List of strings*/
package collect;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class reverseList {
	 // Method to reverse a List of strings
    public static List<String> reverseList(List<String> list) {
        Collections.reverse(list); // Using the reverse method from Collections class
        return list;
    }
    public static void main(String[] args) {
        // Create a List of strings
        List<String> stringList = new ArrayList<>();
        stringList.add("Hi");
        stringList.add("I");
        stringList.add("am");
        stringList.add("Anurag");
        System.out.println("Original List: " + stringList);
        // Reverse the List of strings
        List<String> reversedList =reverseList(stringList);
        	
        // Display the reversed List
       
        System.out.println("Reversed List: " + reversedList);
    }

   
    
}
