package lab3_2;
//Write a Java program to reverse a given string using a stack data structure.
import java.util.Stack;

public class StringReverser {

    // Method to reverse a string using a stack
    public static String reverseString(String input) {
        Stack<Character> stack = new Stack<>();
        
        // Push all characters of the string into the stack
        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }
        
        // Pop all characters from the stack and append them to the result
        StringBuilder reversedString = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedString.append(stack.pop());
        }
        
        return reversedString.toString();
    }

    // Main method for testing
    public static void main(String[] args) {
        String originalString = "Hello, World!";
        System.out.println("Original String: " + originalString);

        String reversedString = reverseString(originalString);
        System.out.println("Reversed String: " + reversedString);
    }
}
