package pl.aleksandrawolny.Data;

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
	
    public static Option createFromInt(int option) {
        return Option.values()[option - 1];
    }
}