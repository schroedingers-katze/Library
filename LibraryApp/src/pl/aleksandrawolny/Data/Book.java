package pl.aleksandrawolny.Data;
/*tytuł
autor
rok wydania
ilość stron
wydawnictwo
numer ISBN*/

public class Book extends Publication{

	//class fields
	private String author;
	private int pages;
	private String ISBNNumber;
	
	//getters and setters
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public String getISBNNumber() {
		return ISBNNumber;
	}
	public void setISBNNumber(String ISBNNumber) {
		ISBNNumber = ISBNNumber;
	}
	
	
	

	public Book(String title, String author, int year, int pages, String publisher, String ISBNNumber) {
		super(title, publisher, year);
		this.author = author;
		this.pages = pages;
		this.ISBNNumber = ISBNNumber;
	}

	public Book(Book book){
		this(book.getTitle(), book.author, book.getYear(), book.pages, book.getPublisher(), book.ISBNNumber);
	}
	@Override
	public String toString() {
		return "Book [title: " + getTitle() + ", author: " + author + ", year: " + getYear() + ", pages: " + pages + ", publisher: "
				+ getPublisher() + ", ISBNNumber: " + ISBNNumber + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ISBNNumber == null) ? 0 : ISBNNumber.hashCode());
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + pages;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (ISBNNumber == null) {
			if (other.ISBNNumber != null)
				return false;
		} else if (!ISBNNumber.equals(other.ISBNNumber))
			return false;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (pages != other.pages)
			return false;
		return true;
	}
	
	
}
