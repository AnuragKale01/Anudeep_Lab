package sort;

//Write a Java program that uses Insertion Sort to sort an array of strings in lexicographical (alphabetical) order. Allow the user to input a list of strings, sort them, and display the sorted list. 
import java.util.Scanner;

public class InsertionSortStrings {

    // Method to perform insertion sort on an array of strings
    public static void insertionSort(String[] array) {
        for (int i = 1; i < array.length; i++) {
            String key = array[i];
            int j = i - 1;

            // Move elements of array[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && array[j].compareTo(key) > 0) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of strings
        System.out.print("Enter the number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        // Create an array to hold the strings
        String[] strings = new String[n];

        // Prompt the user to enter each string
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            strings[i] = scanner.nextLine();
        }

        // Sort the array using insertion sort
        insertionSort(strings);

        // Display the sorted list of strings
        System.out.println("Sorted list of strings:");
        for (String str : strings) {
            System.out.println(str);
        }

      
    }
}
