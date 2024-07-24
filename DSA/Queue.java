package DSA;
//Implement a simple queue using an array in Java. Your queue should support the following operations: 
//
//● enqueue(int item): Add an item to the rear of the queue. 
//
//● dequeue(): Remove and return an item from the front of the queue. 
//
//● isEmpty(): Check if the queue is empty. ● size(): Get the number of elements in the queue.
public class Queue {
    private int[] array;
    private int front;
    private int rear;
    private int size;

    // Constructor to initialize the queue
    public Queue(int capacity) {
        array = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Method to add an item to the rear of the queue (enqueue)
    public void enqueue(int item) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full");
        }
        rear = (rear + 1) % array.length;
        array[rear] = item;
        size++;
    }

    // Method to remove and return an item from the front of the queue (dequeue)
    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        int removedItem = array[front];
        front = (front + 1) % array.length;
        size--;
        return removedItem;
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Method to get the number of elements in the queue
    public int size() {
        return size;
    }

    // Method to check if the queue is full
    private boolean isFull() {
        return size == array.length;
    }

    // Main method for testing
    public static void main(String[] args) {
        Queue queue = new Queue(5);

        // Enqueue elements
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        // Dequeue and print elements
        System.out.println("Dequeued item: " + queue.dequeue());
        System.out.println("Dequeued item: " + queue.dequeue());

        // Enqueue more elements
        queue.enqueue(4);
        queue.enqueue(5);

        // Print size of the queue
        System.out.println("Size of the queue: " + queue.size());

        // Dequeue and print elements
        while (!queue.isEmpty()) {
            System.out.println("Dequeued item: " + queue.dequeue());
        }

        // Trying to dequeue from an empty queue
        // System.out.println(queue.dequeue()); // This will throw an exception
    }
}
