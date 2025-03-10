package day16.io.file문자;

public class Customer  {
	
	String name;
	int age;
	public Customer(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return name + ", "+  age  ;
	}
	
	

}
