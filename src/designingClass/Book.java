package designingClass;

public class Book {

	private String title;
	private int pages;
	
	public Book() {
		title= "NA";
		pages=0;
	}
	
	public Book (String xTitle, int xPages) {
		title= xTitle;
		pages= xPages;
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getPages() {
		return pages;
	}
}
