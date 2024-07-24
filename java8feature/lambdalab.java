/* Write a Java program that uses lambda expressions to manipulate strings. Create lambda expressions to perform the following operations on a given string: ● Convert the string to uppercase ● Convert the string to lowercase ● Reverse the string */
package java8feature;
import java.util.*;
interface manipilateString{
	void upperCase();
}
interface StringLow{
	void lowerCase();
}
interface revString{
	void rev();
}
public class lambdalab {
	public static void main(String[] args) {
		String inputString = "Hello, World!";

		// Lambda expressions for string manipulation for Uppercase
		manipilateString m=()->{
			System.out.print("Uppercase Coversion:");
			System.out.println(inputString.toUpperCase()); 	

		};
		// Lambda expressions for string manipulation for Lowercase
		StringLow l=()->{
			System.out.println("Lower Conversion:");
			System.out.println(inputString.toLowerCase());
		};

		// Lambda expressions for string manipulation for Reverse String 
		revString r=()->{
			System.out.println("Reverse String Conversion:");
			StringBuilder reversed = new StringBuilder();
			for (int i = inputString.length() - 1; i >= 0; i--) {
				reversed.append(inputString.charAt(i));

			}
			System.out.println(reversed);
		};


		// Output
		System.out.println("Original String: " + inputString);
		m.upperCase();//for All Uppercase Letter
		l.lowerCase();//for All lowercase Letter
		r.rev();//for reverse String
	}
}
