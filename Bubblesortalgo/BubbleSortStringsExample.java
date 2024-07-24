package Bubblesortalgo;
//Write a Java program to sort an array of strings in alphabetical order using the Bubble sort algorithm. Also experiment by comparing the result using Arrays.sort() method of Java Library. Print the original array and the sorted array using the following command: System.out.println (Arrays.toString(arr));
import java.util.Arrays;

public class BubbleSortStringsExample {
    // Method to perform Bubble Sort on an array of strings
    public static void bubbleSort(String[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    // Swap arr[j] and arr[j + 1]
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped in the inner loop, then break
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        // Original array of strings
        String[] arr = {"banana", "apple", "cherry", "elderberry", "orange", "grape","Strawberry"};

        // Print the original array
        System.out.println("Original array: " + Arrays.toString(arr));

        // Make a copy of the original array for bubble sort
        String[] bubbleSortedArray = Arrays.copyOf(arr, arr.length);

        // Perform Bubble Sort on the copy
        bubbleSort(bubbleSortedArray);

        // Print the Bubble sorted array
        System.out.println("Bubble sorted array: " + Arrays.toString(bubbleSortedArray));

        // Make a copy of the original array for library sort
        String[] librarySortedArray = Arrays.copyOf(arr, arr.length);

        // Sort using Arrays.sort() method
        Arrays.sort(librarySortedArray);

        // Print the Arrays.sort() sorted array
        System.out.println("sort array using pre defined  function: " + Arrays.toString(librarySortedArray));
    }
}
