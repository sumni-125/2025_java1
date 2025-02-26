package day09;
/*
 * 학생 정보를 처리할 Type이 필요함 ->type를 만들어서 사용(사용자정의 자료형)
 * 
 * 학생정보를 처리할 type을 설계, 정의하는 것
 * 
 * 데이터+데이터를 다루는 함수(메서드)
 * 
 * */
public class Student2 {

	
	String name;
	int kor;
	int eng;
	int total;
	
	public void input(String name, int kor, int eng) {
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

