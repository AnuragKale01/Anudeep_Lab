package stackprogram;
/*Implement a basic stack data structure in Java type Integer in Java. Please use Java Arrays for this purpose. Your stack should support the following operations only: ● push(item): Add an item to the top of the stack. ● pop(): Remove and return the item from the top of the stack. ● peek(): Return the item at the top of the stack without removing it. ● isEmpty(): return true if there is no element in the stack. 

*/
public class Stack {
    private Integer[] array;
    private int top; // Index of the top element in the stack


    // Constructor to initialize the stack with a specified capacity
    public Stack(int capacity) {
        array = new Integer[capacity];
        top = -1; // Initialize top to -1 as the stack is empty initially
    }


    // Method to add an item to the top of the stack
    public void push(Integer item) {
        if (top == array.length - 1) {
            // Stack is full, cannot push more items
            System.out.println("Stack overflow! Cannot push " + item);
            return;
        }
        array[++top] = item;
    }


    // Method to remove and return the item from the top of the stack
    public Integer pop() {
        if (isEmpty()) {
            // Stack is empty, cannot pop
            System.out.println("Stack underflow! Stack is empty.");
            return null;
        }
        return array[top--];
    }


    // Method to return the item at the top of the stack without removing it
    public Integer peek() {
        if (isEmpty()) {
            // Stack is empty, cannot peek
            System.out.println("Stack is empty.");
            return null;
        }
        return array[top];
    }


    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }


    public static void main(String[] args) {
        Stack stack = new Stack(5);


        System.out.println("Is stack empty? " + stack.isEmpty());


        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);


        System.out.println("Is stack empty? " + stack.isEmpty());
        System.out.println("Top element of the stack: " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Top element of the stack after pop: " + stack.peek());
    }
}
