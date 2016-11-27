package pl.aleksandrawolny.Utils;

import pl.aleksandrawolny.Data.*;
public class LibraryUtils {
	
	public static void printBooks(Library lib){
		Publication[] publications = lib.getPublications();
		int pubNumber = lib.getPubNumber();
		int bookCount = 0;
		for(int i = 0; i < pubNumber; i++){
			if(publications[i] instanceof Book){
				System.out.println(publications[i].toString());
				bookCount++;
			}
		}
		if(bookCount == 0){
			System.out.println("No books in the library!");
		}
	}
	
	public static void printMagazines(Library lib){
		Publication[] publications = lib.getPublications();
		int pubNumber = lib.getPubNumber();
		int magCount = 0;
		for(int i = 0; i < pubNumber; i++){
			if(publications[i] instanceof Magazine){
				System.out.println(publications[i].toString());
			}
		}
		if(magCount == 0){
			System.out.println("No magazines in the library");
		}
	}
}
