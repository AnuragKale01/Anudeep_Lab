package MapLab;

/*Write a Java program that demonstrates the functionality of this dictionary application using a TreeMap. Your program should include the following features: i)A TreeMap named dictionary to store word-definition pairs. ii)A way to input word-definition pairs and add them to the dictionary. iii)A way to retrieve and display the definition of a specific word. iv)An iteration through the dictionary to display all word-definition pairs in alphabetical order based on words.*/

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class DictionaryApplication {
	public static void main(String[] args) {
		// TreeMap to store word-definition pairs
		TreeMap<String, String> dictionary = new TreeMap<>();

		// Scanner for user input
		Scanner scanner = new Scanner(System.in);

		// Menu for the user
		System.out.println("Dictionary Application\n");
		System.out.println("1. Add word-definition pair");
		System.out.println("2. Retrieve and display definition of a word");
		System.out.println("3. Display all word-definition pairs in alphabetical order");
		System.out.println("4. Exit\n");


		int choice;
		do {
			System.out.print("Enter your choice (1-4): ");
			choice = scanner.nextInt();
			scanner.nextLine(); // Consume newline character

			switch (choice) {
			case 1:
				addWordDefinitionPair(scanner, dictionary);
				break;
			case 2:
				retrieveAndDisplayDefinition(scanner, dictionary);
				break;
			case 3:
				displayAllWordDefinitions(dictionary);
				break;
			case 4:
				System.out.println("Exiting the program...");
				break;
			default:
				System.out.println("Invalid choice. Please enter a number between 1 and 4.");
			}
		} while (choice != 4);

		// Close the scanner
		scanner.close();
	}


	// Method to add word-definition pair to the dictionary
	private static void addWordDefinitionPair(Scanner scanner, TreeMap<String, String> dictionary) {
		System.out.print("Enter the word: ");
		String word = scanner.nextLine();
		System.out.print("Enter the definition: ");
		String definition = scanner.nextLine();
		dictionary.put(word, definition);
		System.out.println("Word-definition pair added successfully.\n");
	}


	// Method to retrieve and display definition of a word
	private static void retrieveAndDisplayDefinition(Scanner scanner, TreeMap<String, String> dictionary) {
		System.out.print("Enter the word to retrieve its definition: ");
		String word = scanner.nextLine();
		String definition = dictionary.get(word);
		if (definition != null) {
			System.out.println("Definition of " + word + ": " + definition + "\n");
		} else {
			System.out.println("Definition not found for the word: " + word + "\n");
		}
	}


	// Method to display all word-definition pairs in alphabetical order
	private static void displayAllWordDefinitions(TreeMap<String, String> dictionary) {
		System.out.println("All word-definition pairs in alphabetical order:");
		for (Map.Entry<String, String> entry : dictionary.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		System.out.println();
	}
}
