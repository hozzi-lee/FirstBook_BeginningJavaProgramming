package array;

public class Book {

	// field
	private String bookName;
	private String author;



	// constructors
	public Book() { // default constructors --> noProblem skip But noSkip when overload
		super(); // default Object.class --> noProblem skip
	}

	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}



	// method getter/setter
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookName() {
		return bookName;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	public String getAuthor() {
		return author;
	}

	// method
	public void showBookInfo() {
		System.out.println(bookName + ", " + author);
	}

}
