package day16.sample;

 

public class Book {

	String bookId;
	String title;
	String author ;
	int state=1 ;   //0  (대여중)   1 (대여가능)   2 (연체중)
	
	
	public Book(String bookId, String title, String author) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
	}


	public int getState() {
		return state;
	}


	public void setState(int state) {
		this.state = state;
	}


	public String getBookId() {
		return bookId;
	}


	@Override
	public String toString() {
	
		return "Book [bookId=" + bookId + ", title=" + title + ", author=" + author + ", state=" + state + "]";
	} 
	
	
}
