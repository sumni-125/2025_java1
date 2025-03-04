package day12.상속.생성자;

public class Person {
	
	String name;
	String id;
	
	//기본생성자
	public Person() {
		System.out.println("부모의 기본생성자");
	}
	
	public Person(String name, String id) {
		System.out.println("부모의 매개변수 있는 생성자");
		this.name = name;
		this.id = id;
	}
	
	public String toString() {
		return name+id;
	}
	
}
