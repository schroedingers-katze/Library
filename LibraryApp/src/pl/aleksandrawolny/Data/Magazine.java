package pl.aleksandrawolny.Data;

public class Magazine extends Publication{
	//class fields
	private String month;
	private int day;
	private String language;
	
	//getters and setters
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
	//constructor
	public Magazine(String title, String publisher, int year, String month, int day, String language) {
		super(title, publisher, year);
		this.month = month;
		this.day = day;
		this.language = language;
	}
	
	@Override
	public String toString() {
		return "Magazine [title: " + getTitle() + ", publisher: " + getPublisher() + ", year:  " + getYear() + ", month: " + month + ", day: " + day + ", language: " + language + "]";
	}
}