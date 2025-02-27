package day10.실습문제;

public class BookInfo2 {

	private String title;
	private String author;
	private int price;
	int quantity;
	private int totalPrice;
	
	public BookInfo2() {
		
	}
	public BookInfo2(String title, String author, int price, int quantity) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String toString() {
		return "제목: "+title+", 작가: "+author+", 가격: "+price+", 수량: "+quantity+", 총 금액: "+totalPrice;
	}
	
	public int calcTotal() {
		totalPrice=price*quantity;
		return totalPrice;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
