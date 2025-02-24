package day07;

public class 함수만나기2 {

	public static void main(String[] args) {
		화폐매수구하기(999650);
	}
	
	//
	//기능
	//입력:o
	//반환:x
	
	public static void 화폐매수구하기( int cost) {
		int cnt_50000 = 0;
		int cnt_10000 = 0;
		int cnt_5000 = 0;
		int cnt_1000 = 0;
		int cnt_500 = 0;
		int cnt_100 = 0;
		int cnt_50 = 0;
		int cnt_10 = 0;
		
		cnt_50000 = cost / 50000;
		cost = cost % 50000;
		cnt_10000 = cost / 10000;
		cost = cost % 10000;
		cnt_5000 = cost / 5000;
		cost = cost % 5000;
		cnt_1000 = cost / 1000;
		cost = cost % 1000;
		cnt_500 = cost / 500;
		cost = cost % 500;
		cnt_100 = cost / 100;
		cost = cost % 100;
		cnt_50 = cost / 50;
		cost = cost % 50;
		cnt_10 = cost / 10;
		cost = cost % 10;

		System.out.println("50000원 : "+cnt_50000);
		System.out.println("10000원 : "+cnt_10000);
		System.out.println("5000원 : "+cnt_5000);
		System.out.println("1000원 : "+cnt_1000);
		System.out.println("500원 : "+cnt_500);
		System.out.println("100원 : "+cnt_100);
		System.out.println("50원 : "+cnt_50);
		System.out.println("10원 : "+cnt_10);
	}

}
