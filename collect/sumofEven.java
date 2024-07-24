/*Write a Java program that calculates the sum of all even numbers present in an ArrayList of integers. */
package collect;

import java.util.ArrayList;

public class sumofEven {
	// Method to calculate the sum of even numbers in an ArrayList
    public static int sumOfEvenNumbers(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int num : numbers) {
            if (num % 2 == 0) { // Check if the number is even
                sum += num; // Add the even number to the sum
            }
        }
        return sum;
    }
	public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(9);
        numbers.add(4);
        numbers.add(6);
        numbers.add(8);
        numbers.add(12);
        numbers.add(3);

        // Calculate the sum of even numbers
        int sum= sumOfEvenNumbers(numbers);

        // Display the sum of even numbers
        System.out.println("Sum of even numbers: " + sum);
    }

    
}
