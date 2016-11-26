package pl.aleksandrawolny.App;

import pl.aleksandrawolny.Data.*;
import pl.aleksandrawolny.Utils.*;
import java.util.*;

public class LibraryControl {
	private DataReader dr;
	private Library lb;
	
	public LibraryControl(){
		dr = new DataReader();
		lb = new Library();
	}
	
	public void controlLoop(){
		boolean program = true;
		while(program){
			printOptions();
			Option option = Option.createFromInt(dr.getInt());
			//int option = dr.getInt();
			switch(option){
				case ADD_BOOK:
					addBook();
					break;
				case SEE_BOOKS:
					printBooks();
					break;
				case ADD_MAGAZINE:
					addMagazine();
					break;
				case SEE_MAGAZINES:
					printMagazines();
					break;
				case EXIT:		
					System.out.println("bye, bye");
					program = false;
					break;
				default:
					System.out.println("no such option, try again: ");
			}
		}
		dr.close();
	}
	
	private void printOptions(){
		System.out.println("Choose your option: ");
        System.out.println("1 - add new book");
        System.out.println("2 - show all books");
        System.out.println("3 - add new magazine");
        System.out.println("4 - show all magazines");
        System.out.println("5 - wyjście z programu");

	}
	
	private void addBook(){
		Book book = dr.readBook();
		lb.addBook(book);
	}
	
	private void printBooks(){
		lb.printBooks();
	}
	
	private void addMagazine(){
		Magazine magazine = dr.readMagazine();
		lb.addMagazine(magazine);
	}
	
	private void printMagazines(){
		lb.printMagazines();
	}
}