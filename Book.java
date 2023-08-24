/**
* @author Michael Mapanao
* Course : TCSS 143 A, SP 23
* Instructor : Sikha Pentyala
* Book.java
*
*Book class emulates a real book, 
*I have multiple constructors to be able to pull 
*books with different information. 
*
*Book objects are used to be stored in the Library
*class in arrays (shelves) and (inventory)
*
* @version 1.0
*/


public class Book {
	
	// encapsulated fields
	
	private String title;
	private String author;
	private String publisher;
	private int publishYear;
	private String genre;
	
	
	//different constructors
	
	public Book(String title, String author, String publisher, int publishYear, String genre) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.publishYear = publishYear;
		this.genre = genre;	
		
	}
	
	public Book(String title) {
		this.title = title;
	}
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public Book() {
		
	}
	
	//setters and getters for private fields

	public void setTitle(String title) {
		this.title = title;
		
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setPublishYear(int publishYear) {
		this.publishYear = publishYear;
	}
	
	public int getPublishYear() {
		return publishYear;
	}
	
	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public void setGenre (String genre) {
		this.genre = genre;
	}
	
	public String getGenre() {
		return genre;
	}
	
	//methods
	
	//toString method for search() method
	
	public String toString() {
		return "Book Title: " + title + "\nBook Author: " + author + "\nBook Genre: " + genre + "\nBook Publisher: " 
				+ publisher + "\nBook Year: " + publishYear; 
	}
	
} 
