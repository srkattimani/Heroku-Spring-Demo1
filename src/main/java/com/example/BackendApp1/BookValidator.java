package com.example.BackendApp1;

public class BookValidator {
	
	public boolean isValid(Book book) {
		
		if (book.getName() != null)
			return true;
		return false;
	}

}
