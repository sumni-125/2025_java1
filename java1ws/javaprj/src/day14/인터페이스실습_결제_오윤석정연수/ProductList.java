package day14.인터페이스실습_결제_오윤석정연수;

import java.util.ArrayList;

public class ProductList{

	ArrayList<Product> products = new ArrayList<>();
	
	public ProductList() {
		
	}
	
	
	public ArrayList<Product> makeList() {
		products.add(new Product("코카콜라", 2000, "1"));
		products.add(new Product("새우깡", 1500, "2"));
		products.add(new Product("진라면", 1000, "3"));
		
		return products;
	}
	
	
}
