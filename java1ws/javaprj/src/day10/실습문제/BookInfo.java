package day10.실습문제;

public class BookInfo {

	String title;
	String author;
	int price;
	
	public BookInfo() {
		
	}
	public BookInfo(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public String toString() {
		return "제목: "+title+", 작가: "+author+", 가격: "+price;
	}
	
	
	
}
