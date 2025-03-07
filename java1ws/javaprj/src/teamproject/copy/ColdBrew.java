package teamproject.copy;

public class ColdBrew implements Order{

	@Override
	public String Order() {
		String menu="콜드브루";
		return menu;
	}
	
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return 2000;
	}

}
