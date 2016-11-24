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
			int option = dr.getInt();
			switch(option){
				case 1:
					addBook();
					break;
				case 2:
					printBooks();
					break;
				case 3:					
					program = false;
					break;
				default:
					System.out.println("zła opcja");
			}
		}
		dr.close();
	}
	
	private void printOptions(){
		System.out.println("Wybierz opcję: ");
        System.out.println("1 - dodanie nowej książki");
        System.out.println("2 - wyświetl dostępne książki");
        System.out.println("3 - wyjście z programu");
	}
	
	private void addBook(){
		Book book = dr.readBook();
		lb.addBook(book);
	}
	
	private void printBooks(){
		lb.printBooks();
	}
}
