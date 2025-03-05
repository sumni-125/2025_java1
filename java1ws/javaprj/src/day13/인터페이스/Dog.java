package day13.인터페이스;

public class Dog implements 전투가능한{
	
	public void 집을지킨다() {
		System.out.println("집을 지킨다");
	}

	@Override
	public void 싸운다() {
		System.out.println("이빨을 드러내고 싸운다");
		
	}
}
