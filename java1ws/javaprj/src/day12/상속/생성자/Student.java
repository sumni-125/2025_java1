package day12.상속.생성자;

public class Student extends Person{
	
	int classNo;//반
	
	//생성자
	public Student() {
		super("아무개","0000");
	}
	
	public Student(String name, String id, int classNo) {
		//객체의 변수 초기화를 해야함
		//부모의 기분생성자를 호출하는 코드가 자동으로 들어감(부모의 기본생성자가 호출됨)
		
		//부모의 매개변수가 있는 생성자를 명시적으로 호출함 이때 사용하는 키워드가 super()
		//super()	//부모의 기본생성자를 호출함(아무것도 작성하지 않으면 이코드가 들어감
		super(name, id);
		
		//this.name = name;
		//this.id = id;
		this.classNo = classNo;
		
	}
	
	//상속관계에서 자식의 생성자에서는 부모의 기본생성자를 호출하게 되어있다(루틴)
	//super();	=> 부모의 기본생성자 호출하는 방법(이 코드가 자동으로 생성됨)
	//자식의 생성자에서 부모의 매개변수가 있는 생성자를 호출하고 싶다면
	//명시적으로 super(name, id);	호출해야한다
	
	
	
	
	//toString
	/*
	public String toString() {
		return name +" "+ id +" "+ classNo;
	}
	*/
	
	public String toString() {
		return super.toString()+" "+this.classNo;
	}
	
}
