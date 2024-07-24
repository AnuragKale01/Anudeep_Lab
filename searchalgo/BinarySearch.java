package searchalgo;

//Binary Search Implementation: 
//
//● Implement the binary search algorithm in Java. 
//
//● Create a sorted array of integers and search for a specific element in the array. 
//
//● Display whether the element was found or not and its index if found.
public class BinarySearch {

    // Method to perform binary search
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if the target is at mid
            if (array[mid] == target) {
                return mid;
            }

            // If target is greater, ignore the left half
            if (array[mid] < target) {
                left = mid + 1;
            }
            // If target is smaller, ignore the right half
            else {
                right = mid - 1;
            }
        }

        // Return -1 if the target is not found
        return -1;
    }

    public static void main(String[] args) {
        // Create a sorted array of integers
        int[] numbers = {12, 24, 34, 45, 56, 78, 89, 90};
        
        // Specify the target element to search for
        int target = 45;
        
        // Call the binarySearch method and store the result
        int index = binarySearch(numbers, target);
        
        // Display the result
        if (index != -1) {
            System.out.println("Element " + target + " found at index: " + index);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}
