package stackclass;

import java.util.Stack;

public class reverseStack {

	static void reverse(Stack<Integer> stack)
	{
		Stack<Integer> tempStack=new Stack<Integer>();
		Stack<Integer> copyStack=new Stack<Integer>();
		while(!stack.isEmpty())
		{
			tempStack.push(stack.pop());
		}
		while(!tempStack.isEmpty())
		{
			copyStack.push(tempStack.pop());
		}
		while(!copyStack.isEmpty())
		{
			stack.push(copyStack.pop());
		}
	}

	public static void main(String[] args) {

		Stack<Integer> stack=new Stack<Integer>();
		stack.push(11);
		stack.push(12);
		stack.push(13);
		stack.push(14);
		stack.push(15);
		System.out.println("Original stack:"+stack);
		reverse(stack);
		System.out.println("Reverse stack:"+stack);
	}
}
