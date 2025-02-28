package day11.패키지와import.b;

public class Book {
	//new에 의해서 만들어진 new Book();
	String name;
	int price;
	String author;
		
	//방법
	//데이터 넣는 방법 (특별한 방법: 셍성자)
	public Book() {
			
	}
		
	public Book(String name, String author, int price) {
		this.name = name;
		this.author = author;
		this.price = price;
	}
	/*
	 * 매개변수가 다양한 생성자를 만들수있다=>생성자오버로딩
	 * public Book(String name,  int price) {
		this.name = name;
		this.price = price;
	}
	*/
	
	
	//데이터를 얻어오는 방법( toString )
		
	public String toString() {
		return name+price+author;
	}
}
