package day12.상속.다형성;

public class Cat extends Animal{
	
	//부모의 짖다 메서드를 재정의
	//재정의를 하면 부모의 메서드와 별개로 별도의 자식의 메서드가 생긴다
	//재정의할 때는 반드시 부모의 메서드와 일치해야 한다
	
	

	@Override
	public void 짖다() {
		System.out.println("야옹");
	}
	
	
}
