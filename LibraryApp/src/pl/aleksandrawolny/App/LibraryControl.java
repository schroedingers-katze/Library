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

			//int option = dr.getInt();
			try{
				printOptions();
				Option option = Option.createFromInt(dr.getInt());
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
			} catch(InputMismatchException e){
				System.out.println("Wprowadzono niepoprawne dane, publikacji nie dodano");
			} catch(NumberFormatException | NoSuchElementException e){
                System.out.println("Wybrana opcja nie istnieje, wybierz ponownie:");			
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
		LibraryUtils.printBooks(lb);
	}
	
	private void addMagazine(){
		Magazine magazine = dr.readMagazine();
		lb.addMagazine(magazine);
	}
	
	private void printMagazines(){
		LibraryUtils.printMagazines(lb);
	}
	
	public enum Option {
		ADD_BOOK (1),
		SEE_BOOKS (2),
		ADD_MAGAZINE (3),
		SEE_MAGAZINES (4),
		EXIT (5);
		
		private int value;
		
		public int getValue() {
			return value;
		}

		Option(int value){
			this.value = value;
		}
		
	    public static Option createFromInt(int option) throws NoSuchElementException{
	    	Option result = null;
	    	try{
		        return Option.values()[option - 1];
	    	} catch (ArrayIndexOutOfBoundsException e) {
	    		throw new NoSuchElementException("Brak elementu o wskazanym ID");
	    	}
	    }
	}
	
}