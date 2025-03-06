package day14.객체관계.hasA포함;


//A클래스가 B클래스를 가지는 관계
//멤버로 가짐

//강한결합
//A객체가 생길 때 함께 생긴다
public class A {
	
	B b;
	
	public A() {
		b = new B();
	}
	
	public void A메서드() {
		System.out.println("A메서드");
		b.B메서드();
	}
	
}
