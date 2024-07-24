package DSA;
//Implement a priority queue using a min-heap in Java. Your priority queue should support the following operations: 
//
//● insert(int item): Insert an item into the priority queue. 
//
//● deleteMin(): Delete and return the item with the smallest value from the priority queue. 
//
//● isEmpty(): Check if the priority queue is empty. 
//
//● size(): Get the number of elements in the priority queue.
public class MinHeapPriorityQueue {
    private int[] heap;
    private int size;
    private int capacity;

    // Constructor to initialize the priority queue
    public MinHeapPriorityQueue(int capacity) {
        this.capacity = capacity;
        heap = new int[capacity + 1];
        size = 0;
    }

    // Method to insert an item into the priority queue
    public void insert(int item) {
        if (size == capacity) {
            throw new IllegalStateException("Priority queue is full");
        }
        size++;
        heap[size] = item;
        heapifyUp(size);
    }

    // Method to delete and return the item with the smallest value from the priority queue
    public int deleteMin() {
        if (isEmpty()) {
            throw new IllegalStateException("Priority queue is empty");
        }
        int min = heap[1];
        heap[1] = heap[size];
        size--;
        heapifyDown(1);
        return min;
    }

    // Method to check if the priority queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Method to get the number of elements in the priority queue
    public int size() {
        return size;
    }

    // Method to perform heapify up operation
    private void heapifyUp(int index) {
        while (index > 1 && heap[parent(index)] > heap[index]) {
            swap(index, parent(index));
            index = parent(index);
        }
    }

    // Method to perform heapify down operation
    private void heapifyDown(int index) {
        int smallest = index;
        int left = leftChild(index);
        int right = rightChild(index);

        if (left <= size && heap[left] < heap[smallest]) {
            smallest = left;
        }
        if (right <= size && heap[right] < heap[smallest]) {
            smallest = right;
        }

        if (smallest != index) {
            swap(index, smallest);
            heapifyDown(smallest);
        }
    }

    // Method to get the parent index of a given index
    private int parent(int index) {
        return index / 2;
    }

    // Method to get the left child index of a given index
    private int leftChild(int index) {
        return 2 * index;
    }

    // Method to get the right child index of a given index
    private int rightChild(int index) {
        return 2 * index + 1;
    }

    // Method to swap two elements in the heap
    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    // Main method for testing
    public static void main(String[] args) {
        MinHeapPriorityQueue pq = new MinHeapPriorityQueue(10);

        pq.insert(5);
        pq.insert(3);
        pq.insert(8);
        pq.insert(1);
        pq.insert(7);

        System.out.println("Deleted min element: " + pq.deleteMin()); // Output: 1

        System.out.println("Size of priority queue: " + pq.size()); // Output: 4

        while (!pq.isEmpty()) {
            System.out.println("Deleted min element: " + pq.deleteMin());
        }

        
    }
}
