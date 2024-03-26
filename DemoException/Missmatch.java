package DemoException;


import java.util.*;

public class Missmatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter an integer: ");

        try {
            int userInput = scanner.nextInt();
            System.out.println("You entered: " + userInput);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer.");
        }
    }
}
