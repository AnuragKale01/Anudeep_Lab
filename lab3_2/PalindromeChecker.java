package lab3_2;
//Write a Java program to check if a given string is a palindrome. Use a stack to help you compare characters from the beginning and end of the string. Do not use any String functionalities to reverse the String. Use Stack data structure. You can use (A string is called Palindrome if the reverse of the string is the same as the original string. Example: “racecar”. ) 
import java.util.Stack;

public class PalindromeChecker {

    // Method to check if a given string is a palindrome using a stack
    public static boolean isPalindrome(String input) {
        Stack<Character> stack = new Stack<>();
        int length = input.length();

        // Push the first half of the string onto the stack
        for (int i = 0; i < length / 2; i++) {
            stack.push(input.charAt(i));
        }

        // Determine the starting index for comparison depending on the string's length
        int start = (length % 2 == 0) ? length / 2 : length / 2 + 1;

        // Compare the second half of the string with the characters in the stack
        for (int i = start; i < length; i++) {
            if (stack.isEmpty() || input.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    // Main method for testing
    public static void main(String[] args) {
        String[] testStrings = {"racecar", "hello", "level", "world", "madam"};

        for (String testString : testStrings) {
            System.out.println("Is \"" + testString + "\" a palindrome? " + isPalindrome(testString));
        }
    }
}
