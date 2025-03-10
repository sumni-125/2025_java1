package day16.prac.exception;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.놀기();
		
		Object o = (Object)a;
		//o.놀기() 사용할 수 없다 (Object로만 해석 가능함) Object가 가지는 기능만 쓸 수 있다.
		
		System.out.println(o.toString());
		
		B b =new B();
		b.공부하기();
		Object o2 = b;
		//o2.공부하기();
		
		System.out.println(o2.toString());
		
		//올바른 다운캐스팅
		
		((B)o2).공부하기();
		
		
		//잘못된 다운캐스팅
		Object o3 = new Object();
		
		//이것이 잘못된 다운캐스팅이다
		
		((B)o3).공부하기();
		
		
		
	}

}
