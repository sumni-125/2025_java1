package day13.인터페이스;

public class Cat implements 전투가능한{

	public void 쥐를잡는다() {
		System.out.println("쥐를 잡는다");
	}
	
	
	@Override
	public void 싸운다() {
		System.out.println("발톱을 드러내고 싸운다");
	}
}
