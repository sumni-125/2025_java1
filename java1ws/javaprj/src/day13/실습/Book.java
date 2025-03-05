package day13.실습;

public class Book {

	String title;
	String author;
	int number;
	
	public Book(){
		
	}

	public Book(String title, String author, int number) {
		super();
		this.title = title;
		this.author = author;
		
		this.number = number;
	}
	
	public void borrowBook() {
		number--;
	}
	public void returnBook() {
		number++;
	}

	@Override
	public String toString() {
		return "제목: " + title + "  작가: " + author + "  대출가능권수: " + number ;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	
	
}
