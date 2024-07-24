package sort;
//Analyze the performance of the Selection Sort algorithm, Bubble sort and Insertion sort. Write a program that generates random arrays of 1000 elements. Sorts them using Selection Sort, Bubble sort and Insertion sort. Measure the time taken for each size. 
//
//Hints: To create a random number use the java.util.Random class. … 
//
//Random random = new Random(); random.nextInt(100) ; 
//
//// will create a random number between 0 to 100. … 
//
//To measure time for execution use System.nanoTime() method. Please see the example code here 
//
//// Measure and print the time taken for an operation 
//
//long startTime = System.nanoTime(); 
//
//selectionSort(arrSelectionSort); // Execute any code for which time is being measured long selectionSortTime = System.nanoTime() - startTime; // Time diff will give execution time
import java.util.Random;

public class SortingPerformance {

    // Method to perform Selection Sort
    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    // Method to perform Bubble Sort
    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }

    // Method to perform Insertion Sort
    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        // Create a Random object
        Random random = new Random();

        // Generate random arrays of 1000 elements
        int[] arrSelectionSort = new int[1000];
        int[] arrBubbleSort = new int[1000];
        int[] arrInsertionSort = new int[1000];

        for (int i = 0; i < 1000; i++) {
            int randomNumber = random.nextInt(100);
            arrSelectionSort[i] = randomNumber;
            arrBubbleSort[i] = randomNumber;
            arrInsertionSort[i] = randomNumber;
        }

        // Measure time for Selection Sort
        long startTime = System.nanoTime();
        selectionSort(arrSelectionSort);
        long selectionSortTime = System.nanoTime() - startTime;
        System.out.println("Selection Sort Time: " + selectionSortTime + " nanoseconds");

        // Measure time for Bubble Sort
        startTime = System.nanoTime();
        bubbleSort(arrBubbleSort);
        long bubbleSortTime = System.nanoTime() - startTime;
        System.out.println("Bubble Sort Time: " + bubbleSortTime + " nanoseconds");

        // Measure time for Insertion Sort
        startTime = System.nanoTime();
        insertionSort(arrInsertionSort);
        long insertionSortTime = System.nanoTime() - startTime;
        System.out.println("Insertion Sort Time: " + insertionSortTime + " nanoseconds");
    }
}
