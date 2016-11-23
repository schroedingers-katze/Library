package pl.aleksandrawolny.App;

import pl.aleksandrawolny.Data.*;
import pl.aleksandrawolny.Utils.*;
public class Library {

	public static void main(String[] args) {
		Book[] books = new Book[100];
		DataReader dr = new DataReader();
		books[0] = new Book("W pustyni i w puszczy", "Henryk Sienkiewicz", 1999, 478, "Prószyński S-ka", "345676547");
		dr.open();
		books[1] = dr.readBook();
		System.out.println(books[0].toString());
		System.out.println(books[1].toString());
		System.out.println("System może pomieścić " + books.length + " książek.");
		dr.close();
	}
}
