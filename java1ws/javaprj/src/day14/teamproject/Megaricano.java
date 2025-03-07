package day14.teamproject;

public class Megaricano implements Order{

	@Override
	public String Order() {
		String menu="메가리카노";
		return menu;
	}
	
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return 3000;
	}

}
