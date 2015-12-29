package libraryManagment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MyLibrary {
	static int bookId = 0;// for allocating books there id
	static int personId = 0;// for allocating persons there id
	final int MAXCOUNT = 5;
	Scanner sc = new Scanner(System.in);
	List<Book> books = new ArrayList<Book>();
	List <Person>persons = new ArrayList<Person>();
	Set issuedBook = new HashSet();
	Map bookRecord = new HashMap();

	String checkOut(String name) {
		/*
		 * Book book = iterateBook(bookTitle);
		 * 
		 * if (bookRecord.containsKey(book.getBookId())) {
		 * issuedBook.remove(book.getBookId());
		 * bookRecord.remove(book.getBookId()); book.setAvailable(true);
		 * book.setPersonWhoBorrowed(null); } else{
		 * System.out.println("Invalid input!Please enter a valid value"); }
		 */
		ArrayList bookListOfPerson = bookBorrowedByPerson(name);
		if (!bookListOfPerson.isEmpty()) {
			Iterator iterator=bookListOfPerson.iterator();
			while(iterator.hasNext()){
				Book demoBook=iterateBookById((int)iterator.next());
				System.out.println(demoBook);
			}
			System.out.println("please choose the ID of the book to return: ");
			int id = sc.nextInt();
			if (bookListOfPerson.contains(id) && bookRecord.containsKey(id)) {
				issuedBook.remove(id);
				bookRecord.remove(id);
				Book book = iterateBookById(id);
				book.setAvailable(true);
				book.setPersonWhoBorrowed(null);
				return "Book return successfull";
				
			}else{
				return "Book not alloted to person";
			}
		}
		else{
			return "No books are assigned of this name!";
		}
	}

	String checkIn(String bookTitle, String personName) {

		Person person = iteratePerson(personName);
		Book book = iterateBookByTitle(bookTitle);
		if(book.available){
		if (books.contains(book) && persons.contains(person)) {
			issuedBook.add(book.getBookId());
			bookRecord.put(book.getBookId(), person.getName());
			book.setAvailable(false);
			book.setPersonWhoBorrowed(person.getName());
			return "check in successful and book recieved";
		}else{
			return "Invalid value";
		}
		}else{
			return"Book not available for issuance!";
		}

	}

	void addPerson(Person person) {
		person.setPersonId(++personId);
		persons.add(person);

	}

	void removePerson(String name) {

		Person person = iteratePerson(name);
		persons.remove(person);

	}

	void addBook(Book book) {
		book.setBookId(++bookId);
		books.add(book);
	}

	void removeBook(String title) {

		Book book = iterateBookByTitle(title);
		books.remove(book);
	}

	void displayPersons() {

		Iterator<Person> itr = persons.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	void displayBooks() {

		Iterator<Book> itr = books.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	private Person iteratePerson(String name) {

		Iterator iterator = persons.iterator();

		while (iterator.hasNext()) {

			Person person = (Person) iterator.next();

			if (person.getName().equalsIgnoreCase(name)) {
				return person;
			}
		}
		return null;
	}

	private Book iterateBookByTitle(String title) {
		Iterator iterator = books.iterator();

		while (iterator.hasNext()) {

			Book book = (Book) iterator.next();

			if (book.getTitle().equalsIgnoreCase(title)) {
				return book;

			}
		}
		return null;
	}

	private Book iterateBookById(int id) {
		Iterator iterator = books.iterator();

		while (iterator.hasNext()) {

			Book book = (Book) iterator.next();

			if (book.getBookId() == id) {
				return book;

			}
		}
		return null;
	}

	private ArrayList bookBorrowedByPerson(String name) {
		int index=0;
		ArrayList borrowedBook = new ArrayList();
		/*
		 * Iterator iterator = bookRecord.values().iterator();
		 * while(iterator.hasNext()){ String
		 * nameFromList=(String)iterator.next();
		 * if(nameFromList.equalsIgnoreCase(name)){
		 * 
		 * } ++index; }
		 */
		Iterator iterator = issuedBook.iterator();
		while (iterator.hasNext()) {
			System.out.println(++index);
			int key = (int) iterator.next();
			String nameFromList = (String) bookRecord.get(key);
			if (name.equalsIgnoreCase(nameFromList)) {
				borrowedBook.add(key);
			}
			
		}
		return borrowedBook;
		
	}

	void display() {
		System.out.println(bookRecord);
		System.out.println(issuedBook);
	}

	/*
	 * void getAvailableBookForPerson(){
	 * 
	 * }
	 * 
	 * void availableBooks(){
	 * 
	 * }
	 */

}
