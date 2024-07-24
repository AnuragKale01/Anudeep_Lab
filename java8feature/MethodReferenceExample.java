/*Write a Java program that demonstrates the use of method references for static methods. Create a functional interface and use a method reference to call a static method that calculates the square of a number.*/
package java8feature;
//Functional interface for a function that takes an integer and returns an integer
@FunctionalInterface
interface IntFunction {
 int apply(int x);
}

//Utility class with a static method for calculating the square of a number
class MathUtils {
 static int square(int x) {
     return x * x;
 }
}

public class MethodReferenceExample {
 public static void main(String[] args) {
     // Using method reference to call the static method square
     IntFunction squareFunction = MathUtils::square;
     
     // Using the squareFunction to calculate square of a number
     int number = 234;
     int result = squareFunction.apply(number);
     
     System.out.println("Square of " + number + " is: " + result);
 }
}
