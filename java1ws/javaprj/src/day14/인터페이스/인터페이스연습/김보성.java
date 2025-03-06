package day14.인터페이스.인터페이스연습;

public class 김보성 implements 변신가능한, 많이먹는게가능한{

	@Override
	public void 변신하기() {
		System.out.println("새로 변신하기");
	}
	
	@Override
	public void 많이먹다() {
		System.out.println("국밥에 밥 6공기를 먹었다!");
	}
}
