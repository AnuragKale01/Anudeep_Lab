package stackprogram;
/*Que2. Write a Java program to reverse a given string using a stack data structure*/
import java.util.*;
import java.util.Stack;


public class StringReversal {
    public static String reverseString(String input) {
        // Create a stack to store characters of the input string
        Stack<Character> stack = new Stack<>();


        // Push each character of the input string onto the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }


        // Pop characters from the stack and append them to a StringBuilder to form the reversed string
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }


        // Convert StringBuilder to a String and return
        return reversed.toString();
    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
    	System.out.println("enter the string:");
    	String input = sc.next();
        System.out.println("Original string: " + input);
        String reversedString = reverseString(input);
        System.out.println("Reversed string: " + reversedString);
    }
}
