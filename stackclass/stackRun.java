package stackclass;

public class stackRun {

	public static void main(String[] args) {
	class2ndStack stack=new class2ndStack(6);
	stack.puch(8);
	stack.puch(7);
	stack.puch(6);
	stack.puch(6);
	stack.puch(5);
	stack.puch(4);
	int peek=stack.peek();
	System.out.println(peek);
	int size=stack.size();
	System.out.println(size);
//	while(!stack.isEmpty())
//	{
//		System.out.println("Popped element:"+stack.pop()); 
//	}
//	System.out.println(stack.size());

//	while(stack.isFull()) {
//		System.out.println("popped element:"+stack.pop());
//		stack.isFull(Maxsize--)
//	}
	}
	

}
