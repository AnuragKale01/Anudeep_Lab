package lab3_2;

//Write a generic method that takes an array of any type and returns the maximum element from the array. Test it with different types like integers, doubles, and strings
public class GenericArray {

    // Generic method to find the maximum element in an array
    public static <T extends Comparable<T>> T findMax(T[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        T max = array[0];
        for (T element : array) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }

    // Main method to test the generic method with different types
    public static void main(String[] args) {
        // Test with Integer array
        Integer[] intArray = {1, 3, 2, 5, 4};
        System.out.println("Max Integer: " + findMax(intArray)); // Output: 5

        // Test with Double array
        Double[] doubleArray = {1.1, 3.3, 2.2, 5.5, 4.4};
        System.out.println("Max Double: " + findMax(doubleArray)); // Output: 5.5

        // Test with String array
        String[] stringArray = {"apple", "orange", "banana", "pear"};
        System.out.println("Max String: " + findMax(stringArray)); // Output: pear
    }
}
