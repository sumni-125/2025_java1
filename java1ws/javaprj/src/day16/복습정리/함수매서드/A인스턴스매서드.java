package day16.복습정리.함수매서드;

public class A인스턴스매서드 {

	
	public   void 인스턴스매서드1() { //A인스턴스매서드 this
		System.out.println(" 반드시 클래스의 객체를 생성한 후 부터 사용할 수 있다.  ,인스턴스 매서드는 객체의 주소값이 전달된다,this라는 참조형변수가 그 값을 저장한다");
		System.out.println("this사용가능");
		System.out.println("=>객체생성이후부터 사용가능한 매서드이다");		
	}
	
	
	public static void main(String[] args) {
		A인스턴스매서드 o = new A인스턴스매서드();
		o.인스턴스매서드1();  //o.인스턴스매서드1( o);	
		 
	}
}
