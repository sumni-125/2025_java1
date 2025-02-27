package day10.생성자;

public class Student2 {
	
	private  String name;
	private  int age;
	
	
	
	
	//생성자 (매개변수가 있는 생성자)
	//매개변수가 있는 생성자를 만들면 기본생성자는 제공되지 않는다
	public  Student2(  String name, int age) {
		
		this.name  = name;
		this.age =age;
		
	}
	
	//기본생성자 
	public  Student2() {
		
	}
	
	
	public void printInfo() {
		System.out.println(name);
		System.out.println(age);
	}

}
