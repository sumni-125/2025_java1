package day10.객체배열;

public class Customer {
	
	String name;
	int age;
	
	
	
	//생성자
	
	public Customer() {
		
	}
	
	
	
	public Customer(String name, int age) {
		this.name= name;
		this.age = age;
	}
	
	
	//toString()
	
	public String toString() {		
		return name + age;
	}
	
	//printInfo()
	
	public void printInfo() {
		System.out.println( name);
		System.out.println( age);
	}
	
	
	//getter
	
	
	
	//setter
	

}
