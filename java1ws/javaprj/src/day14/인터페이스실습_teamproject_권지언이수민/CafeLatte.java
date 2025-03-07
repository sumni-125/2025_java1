package day14.인터페이스실습_teamproject_권지언이수민;

public class CafeLatte implements Order{

	@Override
	public String Order() {
		String menu="카페라떼";
		return menu;
	}

	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return 3000;
	}
}
