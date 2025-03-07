package day14.인터페이스실습_teamproject_권지언이수민;

public class PeachIcedTea implements Order{

	@Override
	public String Order() {
		String menu="복숭아 아이스티";
		return menu;
	}

	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return 2000;
	}
}
