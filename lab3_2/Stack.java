package lab3_2;
//Implement a basic stack data structure in Java type Integer in Java. Please use Java Arrays for this purpose. Your stack should support the following operations only: ● push(item): Add an item to the top of the stack. ● pop(): Remove and return the item from the top of the stack. ● peek(): Return the item at the top of the stack without removing it. ● isEmpty(): return true if there is no element in the stack. 
public class Stack {
    private Integer[] stackArray;
    private int top;
    private int capacity;

    // Constructor to initialize the stack
    public Stack(int capacity) {
        this.capacity = capacity;
        stackArray = new Integer[capacity];
        top = -1;  // Indicates that the stack is empty
    }

    // Push operation to add an item to the top of the stack
    public void push(Integer item) {
        if (top == capacity - 1) {
            throw new StackOverflowError("Stack is full");
        }
        stackArray[++top] = item;
    }

    // Pop operation to remove and return the item from the top of the stack
    public Integer pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stackArray[top--];
    }

    // Peek operation to return the item at the top of the stack without removing it
    public Integer peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stackArray[top];
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Main method for testing
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Top element is: " + stack.peek());

        System.out.println("Elements in stack: ");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

    }
}
