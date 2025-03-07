package day14.인터페이스실습_결제_오윤석정연수;

public class Product {
	
	String name;
	int price;
	String id;
	public  Product() {
		
	}
	
	public  Product(String name, int price, String id) {
		this.name = name;
		this.price = price;
		this.id = id;
	}
	
	public String toString() {
		return "상품 이름: " + name + " 가격: " + price + " 상품코드: " + id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
	
	

}
