package pl.aleksandrawolny.Data;

public class Magazine extends Publication{
    private static final long serialVersionUID = 1L;

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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + day;
		result = prime * result + ((language == null) ? 0 : language.hashCode());
		result = prime * result + ((month == null) ? 0 : month.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Magazine other = (Magazine) obj;
		if (day != other.day)
			return false;
		if (language == null) {
			if (other.language != null)
				return false;
		} else if (!language.equals(other.language))
			return false;
		if (month == null) {
			if (other.month != null)
				return false;
		} else if (!month.equals(other.month))
			return false;
		return true;
	}
	
	
}