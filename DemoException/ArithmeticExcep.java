package DemoException;
import java.util.*;
public class ArithmeticExcep {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter Numerator:");
		int n=sc.nextInt();
		System.out.println("Enter Denominator:");
		int d=sc.nextInt();
		//int r=0;
		try {
			int r=n/d;
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println(e);
			//e.printStackTrace();
		}
		System.out.println("Executed Code:");
		System.out.println("ljndofbdofo:");
	}

}
