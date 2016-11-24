package pl.aleksandrawolny.Data;

public class Publication {
	//class fields
	private String title;
	private String publisher;
	private int year;
	
	//getters and setters
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Publication(String title, String publisher, int year) {
		this.title = title;
		this.publisher = publisher;
		this.year = year;
	}
}