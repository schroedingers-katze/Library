package pl.aleksandrawolny.App;

public class LibraryApp {

	public static void main(String[] args) {
		//public final String  biblioteka = "Biblioteka";
		LibraryControl lc = new LibraryControl();
		//System.out.println(biblioteka);
		lc.controlLoop();
	}
}
