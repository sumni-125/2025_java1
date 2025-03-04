package day11.패키지와import.b;

public class Snack {
	
	 String name;   // default 접근제한자를 갖는다 (같은 패키지에서 접근 가능)
	  int price;     // default
	
	
	//
	public Snack() {
		
	}
	
	public Snack( String name, int price) {
		this.name= name;
		this.price  = price;
	}
	
	
	
	//
	public String toString() {
		return name+ price;
	}

}
