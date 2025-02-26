package day09.샘플.자판기;

public class 자판기 {
	
	int 설탕 = 1000;
	int 프리마 = 1000;
	int 원두 = 1000;
	int 물 = 10000;
	int 매출금액 = 0;
	

	public String 밀크커피만들기(int 돈) {
		if (돈 == 100) {
			매출금액 += 돈;
			int 물량 = 100;
			int 원두량 = 10;
			int 설탕량 = 10;
			int 프리마량 = 10;
			물 = 물 - 물량;
			원두 = 원두 - 원두량;
			설탕 = 설탕 - 설탕량;
			프리마 = 프리마 - 프리마량;
			return "밀크커피";
		}
		return "";
	}
	

	public void printInfo() {
		System.out.println("<<현재커피 정보 출력>>");
		System.out.println( "매출금액"+ 매출금액);
		System.out.println( "물"+ 물);
		System.out.println( "설탕"+ 설탕);
		System.out.println( "원두"+ 원두);
		System.out.println( "프리마"+ 프리마);
	}

	public void fillCoffee() {
		this.물 += 1000;
		원두 += 100;
		설탕 += 100;
		프리마 += 100;
	}

}
