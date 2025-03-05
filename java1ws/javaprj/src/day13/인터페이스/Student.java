package day13.인터페이스;

public class Student implements 전투가능한{

	public void 공부한다() {
		System.out.println("공부한다");
	}

	@Override
	public void 싸운다() {
		System.out.println("책을 가지고 싸운다");
		
	}
}
