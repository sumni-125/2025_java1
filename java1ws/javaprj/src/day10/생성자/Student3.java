package day10.생성자;

public class Student3 {

	String name;
	int age;
	
	public Student3() {
		
	}
	
	
	public Student3( String name, int age) {
		this.name  = name;
		this.age  = age;
	}
	
	
	
	public void printInfo() {
		System.out.println( name);
		System.out.println( age);
	}
	
	
	
	//객체를 정보를 하나의 문자열로 제공 
	public String  toString() {
		return  name + age;
	}
	
	// setter  : 객체의 속성값을 변경하는 매서드   매서드이름규칙 : set필드명() , setAge()
	// getter  : 객체의 속성값을 얻어오는 매서드   매서드이름규칙 : get필드명() , getAge() 
	
	public int getAge() {
		return age;  // this.age 
	}
	
	
	public String getName() {
		return name;
	}
	
	
	//변경이 필요한 속성들만 setter를 만든다 !
	
	public void setName(String name) {
		
		this.name  = name;
	}
	
	
	public void setAge(  int age) {
		this.age = age;
	}
	
	
	
	
}
