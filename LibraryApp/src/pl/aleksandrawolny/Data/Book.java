package pl.aleksandrawolny.Data;
/*tytuł
autor
rok wydania
ilość stron
wydawnictwo
numer ISBN*/

public class Book {

	//class fields
	private String title;
	private String author;
	private int year;
	private int pages;
	private String publisher;
	private String ISBNNumber;
	
	//getters and setters
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
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getISBNNumber() {
		return ISBNNumber;
	}
	public void setISBNNumber(String iSBNNumber) {
		ISBNNumber = iSBNNumber;
	}
	
	
	
	public Book(String title, String author, int year, int pages, String publisher, String iSBNNumber) {
		super();
		this.title = title;
		this.author = author;
		this.year = year;
		this.pages = pages;
		this.publisher = publisher;
		this.ISBNNumber = iSBNNumber;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", year=" + year + ", pages=" + pages + ", publisher="
				+ publisher + ", ISBNNumber=" + ISBNNumber + "]";
	}
}
