package day16.복습정리.다형성;



//모든클래스는 Object를 상속받는다
//상속받은 부모의 매서드를 재정의함
//부모것과 자식것 각 각 있음
//오버라이드를 하게되면 부모로 다루어도 자식의 매서드가 우선권으로 가지고 실행됨
// 이것으로 인해서 상속관계에서 다형성을 얻을 수 있음 
public class B {

	@Override
	public String toString() {
		return "B객체입니다";
	}
	
	
	void 공부하기() {
		System.out.println("공부하기");
	}
 
}
