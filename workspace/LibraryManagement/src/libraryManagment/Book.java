package libraryManagment;

public class Book {
	int bookId;
	String title;
	String author;
	String personWhoBorrowed;
	boolean available = true;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPersonWhoBorrowed() {
		return personWhoBorrowed;
	}

	public void setPersonWhoBorrowed(String personWhoBorrowed) {
		this.personWhoBorrowed = personWhoBorrowed;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	@Override
	public String toString() {
		return "\nBook :[ID=" + bookId + ", Title=" + title + ", Author Name="
				+ author + ", Person Who Borrowed=" + personWhoBorrowed
				+ ", Available=" + available + "]";
	}

	

}
