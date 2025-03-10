package day16.복습정리.상속;

public class 상속 {

	public static void main(String[] args) {

		// 모든 클래스는 상속을 받지 않으면 Object를 상속 받도록 강제되어 있다.
		// 상속은 부모의 멤버를 물려받는것이다.
		// 코드의 집중화와 재사용성 유지보수가 높은 코드를 작성할 수 있다.
		
		
		
		A  a = new A();  
	
		B  b  = new B();

		//a객체의 매서드에 만들지 않은 다른 매서드들을 확인할 수 있다. Object로 부터 상속 받은것임 
		
		Object o  =a;   // 업캐스팅  놀기 사용못함
		Object o2  =b;   //업캐스팅 공부하기 사용못함
		
		
		//상속관계에서 A, B의 다른  type의 객체를  Object로 다룰 수 있다. 				
		//o로 A객체를 다룰 수 있지만 Object가 가지는 기능만 사용할 수 있다.
		
		
		
		//다운캐스팅	
		((A)o).놀기();
		((B)o2).공부하기();
		

	}

}
