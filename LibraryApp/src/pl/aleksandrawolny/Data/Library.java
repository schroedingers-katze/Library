package pl.aleksandrawolny.Data;

//import pl.aleksandrawolny.Data.*;
import pl.aleksandrawolny.Utils.*;
public class Library {
	public static final int maxPubl = 200;
	private int pubNumber = 0;
	private Publication[] publications;
	//public Publication[] getPublications() {
	//	return publications;
	//}

	public void setPublications(Publication[] publications) {
		this.publications = publications;
	}

	public int getPubNumber() {
		return pubNumber;
	}

	public void setPubNumber(int pubNumber) {
		this.pubNumber = pubNumber;
	}

	public static int getMaxpubl() {
		return maxPubl;
	}
	public Library(){
		publications = new Publication[maxPubl];
	}
	
	public void addBook(Book book){
		if (pubNumber < maxPubl){
			addPublication(book);
		} else {
			System.out.println("Too many publications in the library");
		}
	}
	
	/*public void printBooks(){
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
	}*/
	
	public void addMagazine(Magazine magazine){
		if (pubNumber < maxPubl){
			addPublication(magazine);
		} else {
			System.out.println("Too many publications in the library!");
		}
	}
	
	public void printMagazines(){
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
	
	public void addPublication(Publication publication) throws ArrayIndexOutOfBoundsException{
		if(pubNumber == maxPubl){
			throw new ArrayIndexOutOfBoundsException("maxPubl " + maxPubl);
		}
		publications[pubNumber] = publication;
		pubNumber++;
	}

	public Publication[] getPublications() {
		return publications;
	}
}