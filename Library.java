/**
* @author Michael Mapanao
* Course : TCSS 143 A, SP 23
* Instructor : Sikha Pentyala
*
* Library.Java
*Purpose: Library class represents a library objects
*Library consists of shelves that hold book objects from 
*book class that carry over book values
*
*I used two arrays to store the books (shelf) and to keep
*inventory of all books (inventory)
* @version 1.0
*/


public class Library {
	
	//encapsulated fields
	private String address;
	private String nameOfLibrary;
	private int count = 0;
	Book addBook;
	
	
	//counters for bonus (determines how many books issued and returned)
	public int bookCount = 0;
	public int issuedBook = 0;
	public int returnedBook = 0;
	
	// book objects
	Book theMetaverse = new Book("The Metaverse: And How It Will Revolutionize Everything", "Matthew Ball", "Liveright", 2022, "Technology");
	Book lordofTheRings = new Book("The Lord Of The Rings", "J.R.R. Tolkien", "William Morrow Paperbacks", 2012, "Fiction");
	Book sapiens = new Book("Sapiens: A Brief History of Humankind", "Yuval Harari", "Harper Perennial", 2018, "Science");
	Book asYouGrow = new Book("As You Grow", "Kirk Cameron", "Brave Books", 2022, "Kids");
	Book howTheWorldReallyWorks = new Book("How the World Really Works: The Science Behind How We Got Here and Where We're Going", "Vaclav Smil ", "Viking", 2022, "Philosophy");
	
	Book theFightForPrivacy = new Book("The Fight for Privacy: Protecting Dignity, Identity,and Love in the Digital Age", "Danielle Keats Citron", "W. W. Norton & Company",2022, "Technology");
	Book schoolZone = new Book("School Zone - Big Preschool Workbook", "Joan Hoffman", "School Zone Publishing", 2018, "Kids");
	Book babyUniversity = new Book("Baby University Board Book Set", "Chris Ferrie","Sourcebooks Explore", 2017, "Kids");
	
	
	//array that contains addBook
	
	private Book [] shelf = new Book [10];
	private Book [] inventory = new Book[10];
	
	// Library constructors
	public Library() {
		
	}
	
	public Library(String address, String nameOfLibrary) {
		this.address = address;
		this.nameOfLibrary = nameOfLibrary;
	}
	
	
	// accessors and mutators
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setNameOfLibrary(String nameOfLibrary) {
		this.nameOfLibrary = nameOfLibrary;
	}
	
	public String getNameOfLibrary() {
		return nameOfLibrary;
	}
	
	public void setShelf(Book[] shelf) {
		this.shelf = shelf;
	}
	
	public Book[] getShelf(){
		return shelf;
	}
	
	public Book[] getInventory() {
		return inventory;
	}
	
	//methods
	
	
	//returns nameOfLibrary and address
	public String printAddress() {
		
		return getNameOfLibrary() + "\n" + this.address;
		
	}
	
	//prints opening hours of libraries
	public static void printOpeningHours() {
		System.out.println("9 AM to 5 PM"); 
	}

	
	//for every element a book instance with book information is added to that element
	//shelf is for the available books, inventory is for what should be in the library
	public void addBook(String title, String author, String publisher, int publishYear, String genre) {
		addBook  = new Book(title, author, publisher, publishYear, genre);
		shelf[count] = addBook;
		inventory[count] = addBook;
		count++;
	}
			
	//if element is not null print title of each book 
	//inventory means all books within the library
	//checked out or not
	public void printInventory() {
		
		for(int i = 0; i < inventory.length; i++) {
			if (inventory[i] != null) {
				System.out.println(inventory[i].getTitle());
			}
		}

	}
	
	/* based on shelf.length if the element in shelf does not
	 match the element in inventory, that means the book is not available (checked out)
	 however if the shelf element is not null, and the title matches book argument
	 then print book information */
	public void search(String book) {
		for (int i = 0; i<shelf.length; i++) 
			if (shelf[i] != inventory[i]) {
				
				System.out.println("Book not found!");	
		}
		
	else {
		for ( i = 0; i< shelf.length; i++) {
			if(shelf[i] != null) {
				if(shelf[i].getTitle().equalsIgnoreCase(book)) {
					System.out.println("Book Title: " + shelf[i].getTitle() + " "+ "\nBook Author: " + shelf[i].getAuthor() 
					+ "\nBook Genre: " + shelf[i].getGenre() + "\nBook Publisher: " + shelf[i].getPublisher() + "\nBook Year: " + shelf[i].getPublishYear());	
				}
			}
		}
	}
}
	
	/* to check if book cannot be issued we verify that if shelf element is not equal to inventory element
	 * we cannot issueBook.
	 * 
	 * to check if book is available we search through each element and if the title matches title in the parameter
	 * then we can issue book and make that element in shelf = null to specify it's checked out
	 * 
	 */
	
	public void issueBook(String title) {
		for (int i = 0; i<shelf.length; i++)
		if (shelf[i] != inventory[i]) {
			 
			 System.out.println("\nBook not in the inventory. Cannot Issue!");
			 break;
		 }
		else {
		
		for ( i = 0; i < shelf.length; i++) {
			
			if (shelf[i] != null) {
				if (shelf[i].getTitle().equalsIgnoreCase(title)) {
					issuedBook++;
					 shelf[i] = null;
					}
				} 
			}
		}
	}
	
	// prints getTitle from all books that are not null
	public void printAvailableBooks() {
		
		for(int i = 0; i < shelf.length; i++) {
			if(shelf[i] != null) {
				System.out.println(shelf[i].getTitle());
			}
		}
			
	}
	
	/* to determine where the book should be returned we determine if 
	 * the inventory element is equal to the title argument
	 * once determined the title is equal to the inventory element
	 * we then replace the element in shelf with what book should be 
	 * its place.
	 */
	public void returnBook(String title) { 

		for(int i = 0; i < inventory.length; i++) {
			if (inventory[i] != null)
			if(inventory[i].getTitle() == title) {
				shelf[i] = inventory[i];
					returnedBook++;
				}
			
			}
		}
		
	//Bonus methods
	
	
	/* for every element in inventory that isn't empty we use bookCount
	 *  to determine how many books are in the inventory
	 */
	public int getInventoryCount() {
		
		for(int i = 0; i < inventory.length; i++) {
			if(inventory[i] != null) {
				bookCount++;
			}
		}
		return bookCount;	
	}
	
	/* for getNumberOfIssuedBooks I used the variable
	 * counter issuedBook for every issued book, I also needed to 
	 * take into account if any books were returned so we take
	 * amount of issued books and subtract the amount of returned books
	 */
	public int getNumberOfIssuedBooks() {
		
		int bookResult = issuedBook - returnedBook;;
		
		return bookResult;
		
	}
}
	
	
	
