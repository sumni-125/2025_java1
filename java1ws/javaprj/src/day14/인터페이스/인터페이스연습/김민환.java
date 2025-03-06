package day14.인터페이스.인터페이스연습;

public class 김민환 implements 변신가능한, 많이먹는게가능한{

	@Override
	public void 변신하기() {
		System.out.println("수인화");
	}

	@Override
	public void 많이먹다() {
		System.out.println("햄버거 세트 10개");
		
	}
	
}
