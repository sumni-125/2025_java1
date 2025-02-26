package day09.샘플.자판기;


//구조화된 타입 만들기 
//클래스 정의

 class 커피데이타 {
	int 설탕 = 1000; // 숫자
	int 프리마 = 1000; // 숫자
	int 원두 = 1000;
	int 물 = 10000;
	int 매출금액 = 0;
}
 
 
 
 

public class 자판기구조적프로그램 {


//현재 커피정보 출력
	public static void printInfo(커피데이타 coff) {
		System.out.println("<<현재커피 정보 출력>>");
		System.out.println(coff.매출금액);
		System.out.println(coff.물);
		System.out.println(coff.설탕);
		System.out.println(coff.원두);
		System.out.println(coff.프리마);
	}

// 추가로 채우기
	public static void fillCoffee(커피데이타 coffee) {
		coffee.물 += 1000;
		coffee.원두 += 100;
		coffee.설탕 += 100;
		coffee.프리마 += 100;
	}

	public static String 밀크커피만들기(커피데이타 coffee, int 돈) {
		if (돈 == 100) {
			System.out.println("밀크커피만들기");
			int 물량 = 100;
			int 원두량 = 10;
			int 설탕량 = 10;
			int 프리마량 = 10;
			coffee.물 -= 물량;
			coffee.원두 -= 원두량;
			coffee.설탕 -= 설탕량;
			coffee.프리마 -= 프리마량;
			return "밀크커피 드세요";
		}
		return "";
	}
	
	
	public static void main(String[] args) {
		커피데이타 coffee = new 커피데이타();
		
		printInfo(coffee);
		fillCoffee(coffee);
		밀크커피만들기(coffee, 100);
	}
	 
}
