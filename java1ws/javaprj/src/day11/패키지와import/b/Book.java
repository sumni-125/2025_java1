package day11.패키지와import.b;

public class Book {
	
	
	// new에 의해서 만들어진   new Book();
	String name;
	int price;
	 
	
	
	//방법 
	//데이터 넣는 방법  ( 특별한 방법 : 생성자)
	public Book() {
		
	}
	
	public Book(String name, int price ) {

		this.name = name;
		this.price = price;
		 
	}
 
 
	public String toString() {
		return  name + price  ;
	}

}
