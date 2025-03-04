package day12.상속.super사용;

public class B extends A{
	
	public void 메서드1() {
		System.out.println("B객체의 메서드1");
	}
	
	public void 실행하기() {
		this.메서드1();	//this => 내 멤버 접근
		super.메서드1();	//super => 부모 멤버 접근 할 때
						//부모로부터 상속받은 이름과 내가 추가한 기능의 이름이 동일 할 때 부모의 메서드를 호출하고 싶타면 super라는 키워드를 추가?
		메서드2();
	}
	
}
