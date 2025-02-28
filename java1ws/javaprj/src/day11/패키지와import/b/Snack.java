package day11.패키지와import.b;

public class Snack {
	String name;	//default: 같은 패키지에서는 접근을 허용함
	int price;		//default: 같은 패키지에서는 접근을 허용함
	
	public Snack() {
		
	}
	
	public Snack(String name, int price) {
		this.name = name;
		this.price = price;
		
	}
	
	public String toString() {
		return name+price;
	}
	
	
}
