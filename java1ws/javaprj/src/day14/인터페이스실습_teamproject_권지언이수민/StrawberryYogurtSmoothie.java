package day14.인터페이스실습_teamproject_권지언이수민;

public class StrawberryYogurtSmoothie implements Order{

	@Override
	public String Order() {
		String menu="딸기요거트스무디";
		return menu;
	}
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return 6000;
	}

}
