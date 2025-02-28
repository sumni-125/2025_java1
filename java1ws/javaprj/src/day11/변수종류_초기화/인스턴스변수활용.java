package day11.변수종류_초기화;

class Customer{
	String name;
	int age;
	
	public Customer(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	//
	
	public String toString() {
		return name+age;
	}
	
	//getter 
	//setter => 변경이 필요한 속성들만 제공
	
	
}

public class 인스턴스변수활용 {
	public static void main(String[] args) {
		Customer c1 = new Customer("황예지", 24);
		Customer c2 = new Customer("최하은",25);
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
	}
	
}
