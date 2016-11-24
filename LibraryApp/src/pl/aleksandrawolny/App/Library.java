package pl.aleksandrawolny.App;

import pl.aleksandrawolny.Data.*;
import pl.aleksandrawolny.Utils.*;
public class Library {
	public static final int maxBooks = 100;
	private int booksNumber = 0;
	private Book[] books;
	
	public Library(){
		books = new Book[maxBooks];
	}
	/*	DataReader dr = new DataReader();
		books[0] = new Book("W pustyni i w puszczy", "Henryk Sienkiewicz", 1999, 478, "Prószyński S-ka", "345676547");
		dr.open();
		books[1] = dr.readBook();
		System.out.println(books[0].toString());
		System.out.println(books[1].toString());
		System.out.println("System może pomieścić " + books.length + " książek.");
		dr.close();*/
	public void addBook(Book book){
		if (booksNumber < maxBooks){
			books[booksNumber] = book;
			booksNumber++;
		} else {
			System.out.println("Zbyt wiele książek w bazie!");
		}
	}
	
	public void printBooks(){
		if(booksNumber == 0){
			System.out.println("Brak książek w bibliotece");
		}
		for(int i = 0; i < booksNumber; i++){
			System.out.println(books[i].toString());
		}
	}
}
