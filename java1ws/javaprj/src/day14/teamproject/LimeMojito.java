package day14.teamproject;

public class LimeMojito implements Order{

	@Override
	public String Order() {
		String menu="라임모히또";
		return menu;
	}
	
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return 3500;
	}

}
