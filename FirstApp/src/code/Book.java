package code;

/**
 * This class is written to represent the details of a book
 * 
 * @author Nideshika
 * @version 1.0
 *
 */
public class Book {

	/**
	 * This is to store the name of a book
	 */
	private String book_name;
	/**
	 * This is to store the id of a book
	 */
	private int book_id;
	/**
	 * This is to store the publication year
	 */
	private int year;
	/**
	 * This is to store the name of the author
	 */
	private String author;

	/**
	 * This is the constructor to set all the attributes of the Book class
	 * 
	 * @param book_name
	 * @param book_id
	 * @param year
	 * @param author
	 */
	public Book(String book_name, int book_id, int year, String author) {

		this.book_name = book_name;
		this.book_id = book_id;
		this.year = year;
		this.author = author;
	}

	/**
	 * This is the default constructor
	 */
	public Book() {

	}

	/**
	 * This methods returns the name of a book
	 * @return String
	 */
	public String getBook_name() {
		return book_name;
	}

	public int getBook_id() {
		return book_id;
	}

	public int getYear() {
		return year;
	}

	public String getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	
	
	
	
	
	
	
	

}
