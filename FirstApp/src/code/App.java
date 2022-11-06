/**
 * 
 */
package code;

/**
 * @author staff
 * @see Book
 * @see "Refer how to write a class"
 */
public class App {

	/**
	 * This is an object of the Book class
	 * 
	 * 
	 */
	static Book book;
	/**
	 * Create a book object and display the details of the book to the console
	 * @param args
	 */
	public static void main(String[] args) {

		book = new Book("Secret", 1, 1990, "Rhonda Byrne");

		String details = book.getBook_name() + " " + book.getYear() + " " + book.getAuthor();

		System.out.print(details);

	}

}
