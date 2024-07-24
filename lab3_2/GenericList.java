package lab3_2;

import java.util.ArrayList;
//.Create a generic class called GenericList that uses an ArrayList internally to store elements of a specific type. Implement methods to add elements to the list, retrieve elements by index, and print the list
public class GenericList<T> {
	private ArrayList<T> list;

	public GenericList() {
		list = new ArrayList<>();
	}

	// Method to add an element to the list
	public void addElement(T element) {
		list.add(element);
	}

	// Method to retrieve an element by index
	public T getElement(int index) {
		if (index < 0 || index >= list.size()) {
			throw new IndexOutOfBoundsException("Index out of bounds");
		}
		return list.get(index);
	}

	// Method to print the list
	public void printList() {
		for (T element : list) {
			System.out.println(element);
		}
	}

	// Main method for testing
	public static void main(String[] args) {
		// Create a GenericList for integers
		GenericList<Integer> intList = new GenericList<>();
		intList.addElement(1);
		intList.addElement(2);
		intList.addElement(3);
		System.out.println("Integer List:");
		intList.printList();

		// Create a GenericList for strings
		GenericList<String> strList = new GenericList<>();
		strList.addElement("Hello");
		strList.addElement("World");
		System.out.println("\nString List:");
		strList.printList();

		// Retrieve and print an element by index
		System.out.println("\nElement at index 1 in Integer List: " + intList.getElement(1));
		System.out.println("Element at index 0 in String List: " + strList.getElement(0));
	}
}
