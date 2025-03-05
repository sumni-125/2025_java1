package day13.objectEx;

//상속을 받지 않으면 Object 클래스를 상속받는 코드로 변환된다
//public class A extend Object

public class A {
	String name;
	
	//생성자
	public A() {
		
	}
	
	public A(String name) {
		this.name = name;
	}
	
	//toString()
	
	public void printInfo() {
		System.out.println(name);
	}
	
	@Override
	public String toString() {
		return name;
	}
}

