package teamproject.copy;

public class VanillaLatte implements Order{

	@Override
	public String Order() {
		String menu="바닐라라떼";
		return menu;
	}
	
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return 2500;
	}

}
