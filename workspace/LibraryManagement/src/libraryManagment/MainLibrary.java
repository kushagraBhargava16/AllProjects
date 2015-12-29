package libraryManagment;

import java.util.Scanner;

public class MainLibrary {
	public static void main(String[] args) {

		MyLibrary library = new MyLibrary();

		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("Please select:");
			System.out.println("1.Add Book \n2.Add Person \n3.Remove Book \n4.Remove Person \n5.View Books \n6.View Person \n7.Issue Book \n8.Return Book \n9.Test case\n0.Exit");
			 choice = sc.nextInt();
			switch (choice) {
			case 1:
				Book book = new Book();

				System.out
						.println("Please enter the Title of the book to be added: ");
				String title = sc.next();
				book.setTitle(title);

				System.out.println("Please enter the author of the book: ");
				String author = sc.next();

				book.setAuthor(author);

				library.addBook(book);
				System.out.println("...Book Added...");

				break;

			case 2:
				Person person = new Person();
				System.out
						.println("Please enter the name of the person to be added: ");
				String name = sc.next();
				person.setName(name);
				library.addPerson(person);
				System.out.println("...Person Added...");
				break;

			case 3:
				System.out
						.println("Please enter title of the book to be removed:");
				library.removeBook(sc.next());
				System.out.println("...Book Removed...");
				break;

			case 4:
				System.out
						.println("Please enter the name of person to be removed");
				library.removePerson(sc.next());
				System.out.println("...Person Removed...");
				break;

			case 5:
				library.displayBooks();
				break;

			case 6:
				library.displayPersons();
				break;

			case 7:// checkin
				System.out
						.println("Please the name of the person from the following :");
				library.displayPersons();
				String personName = sc.next();
				System.out
						.println("Please the title of the book from the following :");
				library.displayBooks();
				String bookTitle = sc.next();
				System.out.println(library.checkIn(bookTitle, personName));
				break;

			case 8:// check out
				System.out
						.println("Enter the name of the person who rented the book: ");
				//library.displayBooks();
				String personBook = sc.next();
				System.out.println(library.checkOut(personBook));

				break;
			case 9://test case
				library.display();
				break;
			case 0:
				System.out.println("Thank you!");
				System.exit(0);
				
			default:
				System.out
						.println("Invalid Entry!Please provide a valid entry.");

			}

		} while (true);
	}
}
