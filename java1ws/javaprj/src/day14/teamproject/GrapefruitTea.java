package day14.teamproject;

public class GrapefruitTea implements Order{

	@Override
	public String Order() {
		String menu="자몽차";
		return menu;
	}
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return 2500;
	}

}
