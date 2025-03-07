package teamproject.copy;

public class GoldKiwiJuice implements Order{

	@Override
	public String Order() {
		String menu="골드키위주스";
		return menu;
	}
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return 3500;
	}

}
