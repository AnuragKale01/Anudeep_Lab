package collection1;
/* Write a generic method that takes an array of any type and returns the maximum element from the array. Test it with different types like integers, doubles, and strings. */
public class MaxElementFinder {
    public static <T extends Comparable<T>> T findMaxElement(T[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array is empty or null.");
        }

        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        // Test with integers
        Integer[] intArray = { 10, 5, 20, 15 };
        Integer maxInt = findMaxElement(intArray);
        System.out.println("Max Integer: " + maxInt);

        // Test with doubles
        Double[] doubleArray = { 3.14, 2.71, 1.618, 2.718 };
        Double maxDouble = findMaxElement(doubleArray);
        System.out.println("Max Double: " + maxDouble);

        // Test with strings
        String[] stringArray = { "apple", "banana", "orange", "grape" };
        String maxString = findMaxElement(stringArray);
        System.out.println("Max String: " + maxString);
    }
}

