package day13.추상클래스;


//추상클래스: 추상매서드를 한 개라도 가지면 추상클래스가 된다 
//추상클래스는 new될 수 없다 
//자식이 추상매서드를 구현하고 자식으로 객체가 생성된다 //
//추상클래스는 부모타입으로만 활용한다 

public abstract   class Acorn {
	
	public void 공부하기() {
		System.out.println("공부하기");
	}
	
	 
	/*
	public void 춤추기() {
		System.out.println("에이콘 학생 춤을 춘다");
	}
   */
	
	//구현부가 없는 매서드 => 추상매서드 
	public abstract   void 춤추기();
}
