/*Create a Book class with bookId, bookName and authorName.Create parameterized constructor to initialize the object. Create an ArrayList of type Book and store all book objects into collections and display all book details. [Hint:Use advanced for loop to display all Books details]*/
package collect;

import java.util.ArrayList;

public class Book {
	private int bookId;
	private String bookName;
	private String authorName;

	// Parameterized constructor
	public Book(int bookId, String bookName, String authorName) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.authorName = authorName;
	}
	// Getters
	public int getBookId() {
		return bookId;
	}

	public String getBookName() {
		return bookName;
	}
	
	public String getAuthorName() {
		return authorName;
	}
	public static void main(String[] args) {
		// Create an ArrayList to store Book objects
		ArrayList<Book> books = new ArrayList<>();

		// Adding Book objects to the ArrayList
		books.add(new Book(1, "To Kill a Mockingbird", "Harper Lee"));
		books.add(new Book(2, "1984", "George Orwell"));
		books.add(new Book(3, "The Great Gatsby", "F. Scott Fitzgerald"));
		books.add(new Book(4, "Pride and Prejudice", "Jane Austen"));

		// Displaying all book details using advanced for loop
		System.out.println("Book Details:");
		for (Book book : books) {
			System.out.println("Book ID: " + book.getBookId());
			System.out.println("Book Name: " + book.getBookName());
			System.out.println("Author Name: " + book.getAuthorName());
			System.out.println();
		}
	}
}
