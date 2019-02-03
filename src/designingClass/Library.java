package designingClass;

import java.util.ArrayList;

public class Library {

	private String name;
	private ArrayList<Book> books;

	public Library() {
		name = "My Library";
		for (int i = 0; i < 10; i++) {
			books.add(new Book());
		}
	}

	public Library(String xName, ArrayList<Book> col) {
		name = xName;
		books = col;
	}

	public Book checkOut(int index) {
		return books.remove(index);
	}

	public void returnBook(Book temp) {
		books.add(temp);
	}

	public void fire() {
		books.clear();
	}

///////////////////////////////////////////////////////	
}
