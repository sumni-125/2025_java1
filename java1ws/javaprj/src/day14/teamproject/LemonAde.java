package day14.teamproject;

public class LemonAde implements Order{

	@Override
	public String Order() {
		String menu="레몬에이드";
		return menu;
	}
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return 2000;
	}

}
