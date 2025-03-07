package day14.teamproject;

public class MegaAde implements Order{

	@Override
	public String Order() {
		String menu="메가에이드";
		return menu;
	}
	
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return 5000;
	}

}
