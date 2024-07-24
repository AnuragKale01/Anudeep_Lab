package lab3_2;
//Create a Java class called MinStack of Integers that supports standard stack operations (push, pop, top, and isEmpty) and also provides a getMin method that returns the minimum element in the stack. (Hints: Keep another stack that will hold the minimum value on the top of the stack.)
import java.util.Stack;

public class MinStack {
    private Stack<Integer> mainStack;
    private Stack<Integer> minStack;

    // Constructor to initialize the stacks
    public MinStack() {
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }

    // Push operation
    public void push(int value) {
        mainStack.push(value);
        if (minStack.isEmpty() || value <= minStack.peek()) {
            minStack.push(value);
        }
    }

    // Pop operation
    public int pop() {
        if (mainStack.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        int value = mainStack.pop();
        if (value == minStack.peek()) {
            minStack.pop();
        }
        return value;
    }

    // Top operation
    public int top() {
        if (mainStack.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return mainStack.peek();
    }

    // isEmpty operation
    public boolean isEmpty() {
        return mainStack.isEmpty();
    }

    // getMin operation
    public int getMin() {
        if (minStack.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return minStack.peek();
    }

    // Main method for testing
    public static void main(String[] args) {
        MinStack stack = new MinStack();

        stack.push(3);
        stack.push(5);
        System.out.println("Current Min: " + stack.getMin()); // Output: 3
        stack.push(2);
        stack.push(1);
        System.out.println("Current Min: " + stack.getMin()); // Output: 1
        stack.pop();
        System.out.println("Current Min: " + stack.getMin()); // Output: 2
        stack.pop();
        System.out.println("Top Element: " + stack.top());    // Output: 5
        System.out.println("Current Min: " + stack.getMin()); // Output: 3
    }
}
