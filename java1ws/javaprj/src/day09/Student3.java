package day09;
/*
 * 학생 정보를 처리할 Type이 필요함 ->type를 만들어서 사용(사용자정의 자료형)
 * 
 * 학생정보를 처리할 type을 설계, 정의하는 것
 * 
 * 데이터+데이터를 다루는 함수(메서드)
 * 
 * 캡슐화: 
 * 1. 데이터+ 데이터를 다루는 함수(메서드)
 * 2. 데이터 보호(접근데어지 private, public, protacted, default), 
 * 	     특별한 기능(함수, 메서드): 생성자가 있음
 * 		// 생성자: 객체가 생성될 때(new) 단 한번만 호출됨
 * 
 * */
public class Student3 {

	
	private String name;
	private int kor;
	private int eng;
	private int total;
	/*
	 * 생성자는 항상 호출할 수 있는 기능이 아니다
	 * new 될 때 단 한번 호출된다.
	 * 
	 * 생성자 만드는 규칙=>
	 * 1. 반환 type 명시하면 안됨
	 * 2. 반드시 클래스 이름과 동일해야한다.
	 * 3. 생성자는 만들지 않으면 기본생성자를 제공한다
	 * 
	 * */
	
	//기본생성자
	public Student3(){
		
	}
	
	//기본생성자
	public Student3(String name, int kor, int eng) {
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		
	}
	
	public void calc() {
		this.total=this.kor+this.eng;
	}
	
	public void printInfo() {
		System.out.println(this.name);
		System.out.println(this.kor);
		System.out.println(this.eng);
		System.out.println(this.total);
	}
	
}
//데이터+메서드
//static 제거됨(static 없으면 => 클래스에 소속된 기눙, 메서드이다)
//static 제거된 메서드(함수)=> 클래스에 정의된 변수(구조화된 변수)가 만들어지면 사용할 수 있다는 것을 의미함
//static이 제거된 변수(객체변수, 인스턴스 변수라고 부름) 변수가 만들어진 후 부터 사용하는 것이 의미가 있다.
//변수가 안만들어지면 사용할 수 없다.

