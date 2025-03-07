package day14.teamproject;

public class CitronTea implements Order{

	@Override
	public String Order() {
		String menu="유자차";
		return menu;
	}
	
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return 3600;
	}

}
