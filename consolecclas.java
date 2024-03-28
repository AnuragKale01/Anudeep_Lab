/*Assignment-2. Write a Java program that reads two numbers from the console. Add two numbers and print the output on the console. Use java.io.Console Class to read lines from the console. Convert the Strings to numbers before carrying out the mathematical operations. (Run the program in command prompt only.)*/
package Filestream;

import java.io.Console;

public class consolecclas {
    public static void main(String[] args) {
        Console console = System.console();
        
        if (console == null) {
        	//below statement act like error statement print in red color
            System.err.println("No console available.");
            System.exit(1);
        }
        
        // Read the first number from the console
        String num1Str = console.readLine("Enter the first number: ");
        double num1 = Double.parseDouble(num1Str); // Convert string to double
        
        // Read the second number from the console
        String num2Str = console.readLine("Enter the second number: ");
        double num2 = Double.parseDouble(num2Str); // Convert string to double
        
        // Add the two numbers
        double sum = num1 + num2;
        
        // Print the result
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}