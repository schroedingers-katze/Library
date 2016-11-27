package pl.aleksandrawolny.Data;


import java.util.NoSuchElementException;
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