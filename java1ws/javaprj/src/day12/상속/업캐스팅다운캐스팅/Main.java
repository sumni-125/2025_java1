package day12.상속.업캐스팅다운캐스팅;

public class Main {

	public static void main(String[] args) {
		
		//부모	:Person
		//자식	:Doctor
		
		
		
		Doctor d = new Doctor();
		
		d.printInfo();
		d.treat();
		
		//Doctor 객체를 Doctor type으로 다루는 것은 상식적인 것이다
		
		//상속관계에서 Doctor객체를 부모 type(Person)으로 다루는 것이 가능하다
		
		Person p;
		p=d;	//(업캐스팅): d를 부모type형으로 변환하는 것
				//업캐스팅이란 : 부모타입으로 형 변환하는 것을 말한다
				//단 업캐스팅되면 자식객체의 고유기능은 사용할 수 없다
				//자료형은 해석의 도구라는 것을 기억하자!!!!!!!
		
		//업캐스팅되면 부모의 기능만큼만 사용할 수 있다
		p.printInfo();
		//닥터의 고유기능 treat()사용할 수 없다
		//p.treat();
		
		//다운캐스팅: 자식type으로 형변환 하는 것을 말한다
		
		Doctor doctor = (Doctor)p; 	
		//Person type인 p를 다시 Doctor타입으로 변환하는 것을 다운캐스팅이라고 한다.
		//자식의 고유기능을 사용하기 위해서
		
		doctor.treat();
		
		//다운캐스팅시 주의사항
		//상속관계에서 부모타입을 자식타입으로 변환하는 것을 말한다
		
		//질문
		Person person = new Person();
		Doctor dd = (Doctor) person;//다운캐스팅 시도  문제가 있을까요? 없을까요? 올바른 다운캐스팅이 될 수 있을까?
		
		dd.treat();
		
		//올바른 다운캐스팅 아니다!!
		
		//올바른 다운캐스팅이란?
		//업캐스팅된 경우에 힌해서 다운캐스팅을 사용할 수 있다
		
		//Doctor 객체를 Person 타입으로 참조하는것 가능하다(업캐스팅)
		//업캐스팅된 Doctor 객체를 다시 원래의 Doctor type으로 변환하는 것이 올바른 다운캐스팅이다~!~!~! 
		
		
	}

}
