package stackclass;
import java.util.Collections;
import java.util.Stack;
public class class2ndStack {
	private int Maxsize;
	private int top;
	private int stackarray[];


	public class2ndStack(int size) {
		super();
		Maxsize = size;
		top = -1;
		stackarray = new int[Maxsize];
	}
	public boolean isEmpty()//check if the stack is empty or not
	{
		return (top==-1);

	}
	public boolean isFull() //Check the stack is full or not
	{
		return (top==Maxsize-1);
	}
	public void puch(int value)
	{
		if(isFull())
		{
			System.out.println("Our stack is full Cannot Push");
		}
		else
		{
			stackarray[++top]=value;
		}
	}
	public int pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack is empty");
			return -1;
		}
		else
		{
			return stackarray[top--];
		}
	}
	public int peek()
	{
		if (isEmpty())
		{
			System.out.println("Stack is empty");
			return -1;
		}
		else
		{
			return stackarray[top];

		}
	}
	public int size()
	{
		return top+1;
	}



}
