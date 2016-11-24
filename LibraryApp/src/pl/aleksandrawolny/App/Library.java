package pl.aleksandrawolny.App;

import pl.aleksandrawolny.Data.*;
import pl.aleksandrawolny.Utils.*;
public class Library {
	public static final int maxPubl = 100;
	private int booksNumber = 0;
	private int magNumber = 0;
	private Book[] books;
	private Magazine[] magazines;
	
	public Library(){
		books = new Book[maxPubl];
		magazines = new Magazine[maxPubl];
	}
	
	public void addBook(Book book){
		if (booksNumber < maxPubl){
			books[booksNumber] = book;
			booksNumber++;
		} else {
			System.out.println("Too many books in the library");
		}
	}
	
	public void printBooks(){
		if(booksNumber == 0){
			System.out.println("No books in the library!");
		}
		for(int i = 0; i < booksNumber; i++){
			System.out.println(books[i].toString());
		}
	}
	
	public void addMagazine(Magazine magazine){
		if (magNumber < maxPubl){
			magazines[magNumber] = magazine;
			magNumber++;
		} else {
			System.out.println("Too many magazines in the library!");
		}
	}
	
	public void printMagazines(){
		if(magNumber == 0){
			System.out.println("No magazines in the library");
		}
		for(int i = 0; i < magNumber; i++){
			System.out.println(magazines[i].toString());
		}
	}
}
