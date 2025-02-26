package day09.학생_this.책정보출력_권지언;

public class Book {

	String book_name;
	String author;
	int price;

	public void 입력(String book_name,String author,int price) {
		
		this.book_name = book_name;
		this.author = author;
		this.price = price;
	}
	
	public void 출력() {
		System.out.println("책 이름 : "+this.book_name);
		System.out.println("작가 : "+this.author);
		System.out.println("가격 : "+this.price+"원");
	}
}
