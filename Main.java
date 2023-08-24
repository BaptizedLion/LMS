/**
* @author Michael Mapanao
* Course : TCSS 143 A, SP 23
* Instructor : Sikha Pentyala
*
* PA1 : Library Management System (LMS)
* LMS has two libraries, where each library has a book rack of size 10.
* This means a library can hold upto a maximum of 10 books only.
* A book is identifibale through title (Each title is unique).
* @version 1.0
*/


// Main class contains main method to test programming assignment 1 (PA1)

public class Main {

	public static void main(String args[]) {
		
		
// Creation of two libraries
Library firstLibrary = new Library("123, 2 Ave", "Library 1");
Library secondLibrary = new Library("321, 7 Ave", "Library 2");

//Print Name of Libraries
System.out.println("\n<=========== Libraries in TownX ===========>");
System.out.println(firstLibrary.getNameOfLibrary());
System.out.println(secondLibrary.getNameOfLibrary());

//Print addresses of the libraries
System.out.println("\n<=========== Address of Libraries in TownX===========>");
System.out.println(firstLibrary.printAddress());
System.out.println(secondLibrary.printAddress());
// Print the operating hours of Library
System.out.println("\n<=========== Operating hours of Libraries in TownX===========>");
Library.printOpeningHours();
// Add Books to Library 1

firstLibrary.addBook("The Metaverse: And How It Will Revolutionize Everything", "Matthew Ball", "Liveright", 2022, "Technology");
firstLibrary.addBook("The Lord Of The Rings", "J.R.R. Tolkien", "William Morrow Paperbacks", 2012, "Fiction");
firstLibrary.addBook("Sapiens: A Brief History of Humankind", "Yuval Harari", "Harper Perennial", 2018, "Science");
firstLibrary.addBook("As You Grow", "Kirk Cameron", "Brave Books", 2022, "Kids");
firstLibrary.addBook("How the World Really Works: The Science Behind How We Got Here and Where We're Going", "Vaclav Smil ", "Viking", 2022, "Philosophy");

// Add Books to Library 2
secondLibrary.addBook("The Fight for Privacy: Protecting Dignity, Identity,and Love in the Digital Age", "Danielle Keats Citron", "W. W. Norton & Company",2022, "Technology");
secondLibrary.addBook("School Zone - Big Preschool Workbook", "Joan Hoffman", "School Zone Publishing", 2018, "Kids");
secondLibrary.addBook("Baby University Board Book Set", "Chris Ferrie","Sourcebooks Explore", 2017, "Kids");

// Print Inventory of Library 1 and Library 2
System.out.println("\n<=========== Inventory List ===========>");
System.out.println("First :---");
firstLibrary.printInventory(); 
System.out.println("Second :---");
secondLibrary.printInventory();

// Search Book in Library 1
System.out.println("\n<=========== Searching Book in Library 1===========>");
firstLibrary.search("As You Grow");

// Issue Book from Library 1
firstLibrary.issueBook("The Metaverse: And How It Will Revolutionize Everything");

// Issue Book from Library 2
secondLibrary.issueBook("School Zone - Big Preschool Workbook");

// Print Inventory of Library 1 and Library 2
System.out.println("\n<=========== Inventory List ===========>");
System.out.println("First :---");
firstLibrary.printInventory();
System.out.println("Second :---");
secondLibrary.printInventory();

// Print Available Books in Library 1 and Library 2
System.out.println("\n<=========== Available List ===========>");
System.out.println("First :---");
firstLibrary.printAvailableBooks();
System.out.println("Second :---");
secondLibrary.printAvailableBooks();

// Return Book in Library 2
secondLibrary.returnBook("School Zone - Big Preschool Workbook");

// Print Available Books in Library 1 and Library 2
System.out.println("\n<=========== Available List ===========>");
System.out.println("First :---");
firstLibrary.printAvailableBooks(); //should be println
System.out.println("Second :---");
secondLibrary.printAvailableBooks();

// Check missing cases
firstLibrary.issueBook("ABC");
firstLibrary.search("ABC");
secondLibrary.returnBook("XYZ");

// For bonus :
// print counts for Library 1 and Library 2
System.out.println("\n<=========== Printing Counts ===========>");
System.out.println("Library 1 : Inventory count : " +
firstLibrary.getInventoryCount() + ", Issued count :"+firstLibrary.getNumberOfIssuedBooks());
System.out.println("Library 2 : Inventory count : " + secondLibrary.getInventoryCount() + ", Issued count :"+secondLibrary.getNumberOfIssuedBooks());
}
}

