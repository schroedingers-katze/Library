package pl.aleksandrawolny.App;

import pl.aleksandrawolny.Data.*;
public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1 = new Book("W pustyni i w puszczy", "Henryk Sienkiewicz", 1999, 478, "Prószyński S-ka", "345676547");
		System.out.println(book1.toString());
	}
}
