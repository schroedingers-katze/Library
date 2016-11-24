package pl.aleksandrawolny.Utils;

import java.util.Scanner;
import pl.aleksandrawolny.Data.*;

public class DataReader {
	private Scanner scan;

	public DataReader(){
		scan = new Scanner(System.in);
	}
	public void close(){
		scan.close();
	}
	
	public int getInt(){
		int number = scan.nextInt();
		scan.nextLine();
		return number;
	}

	public Book readBook(){
		System.out.println("The title of the book: ");
		String title = scan.nextLine();
	
		System.out.println("The author of the book: ");
		String author = scan.nextLine();

		System.out.println("The year of the book: ");
		int year = scan.nextInt();
		scan.nextLine();

		System.out.println("The numer of pages of the book: ");
		int pages = scan.nextInt();
		scan.nextLine();

		System.out.println("The publisher of the book: ");
		String publisher = scan.nextLine();

		System.out.println("The isbn number of the book: ");
		String isbn = scan.nextLine();
	
		Book book1 = new Book(title, author, year, pages, publisher, isbn);
		return book1;
	}
	
	public Magazine readMagazine(){
		System.out.println("The title of the magazine: ");
		String title = scan.nextLine();
	
		System.out.println("The day of the magazine: ");
		int day = scan.nextInt();
		scan.nextLine();
		
		System.out.println("The month of the magazine: ");
		String month = scan.nextLine();

		System.out.println("The year of the magazine: ");
		int year = scan.nextInt();
		scan.nextLine();
		
		System.out.println("The publisher of the book: ");
		String publisher = scan.nextLine();

		System.out.println("The language of the book: ");
		String language = scan.nextLine();
	
		Magazine magazine = new Magazine(title, publisher, year, month, day, language);
		return magazine;
	}
}
