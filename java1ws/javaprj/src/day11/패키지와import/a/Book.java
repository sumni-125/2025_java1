package day11.패키지와import.a;

public class Book {
	
	
	// new에 의해서 만들어진   new Book();
	String name;
	int price;
	String author;
	
	
	//방법 
	//데이터 넣는 방법  ( 특별한 방법 : 생성자)
	public Book() {
		
	}
	
	public Book(String name, int price, String author) {

		this.name = name;
		this.price = price;
		this.author =author;
	}
	/*   매개변수가 다양한 생성자를 만들 수 있다  => 생성자 오버로딩
	public Book(String name, int price ) {

		this.name = name;
		this.price = price;
		 
	}
	*/
	//데이터를 얻어 오는 방법( toString )
	
	public String toString() {
		return  name + price + author;
	}

}
