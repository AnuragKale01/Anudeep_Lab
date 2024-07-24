package searchalgo;
//Linear Search Implementation: 
//
//● Write a Java program that implements the linear search algorithm. 
//
//● Create an array of integers and search for a specific element in the array. 
//
//● Display whether the element was found or not and its index if found. 
public class LinearSearch {

    // Method to perform linear search
    public static int linearSearch(int[] array, int target) {
        // Iterate through the array
        for (int i = 0; i < array.length; i++) {
            // Check if the current element matches the target
            if (array[i] == target) {
                // Return the index if the target is found
                return i;
            }
        }
        // Return -1 if the target is not found
        return -1;
    }

    public static void main(String[] args) {
        // Create an array of integers
        int[] numbers = {34, 78, 12, 90, 24, 56, 45, 89};
        
        // Specify the target element to search for
        int target = 90;
        
        // Call the linearSearch method and store the result
        int index = linearSearch(numbers, target);
        
        // Display the result
        if (index != -1) {
            System.out.println("Element " + target + " found at index: " + index);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}
