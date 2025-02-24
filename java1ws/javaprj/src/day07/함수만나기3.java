package day07;

import java.util.Arrays;

public class 함수만나기3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] cnt = 화폐매수구하기(350020);
		
		for(int i=0; i<cnt.length;i++) {
			System.out.print(cnt[i]+", ");
		}
		
		System.out.println("\nArrays.toString()메서드 사용");
		System.out.println(Arrays.toString(cnt));
	}
	
	//함수
	//입력: o
	//반환: o
	
	
	public static int[] 화폐매수구하기(int cost) {
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

		/*
		System.out.println("50000원 : "+cnt_50000);
		System.out.println("10000원 : "+cnt_10000);
		System.out.println("5000원 : "+cnt_5000);
		System.out.println("1000원 : "+cnt_1000);
		System.out.println("500원 : "+cnt_500);
		System.out.println("100원 : "+cnt_100);
		System.out.println("50원 : "+cnt_50);
		System.out.println("10원 : "+cnt_10);
		*/
		
		int[] result = new int[8];
		result[0] = cnt_50000 ;
		result[1] = cnt_10000 ;
		result[2] = cnt_5000 ;
		result[3] = cnt_1000 ;
		result[4] = cnt_500 ;
		result[5] = cnt_100 ;
		result[6] = cnt_50 ;
		result[7] = cnt_10 ;
		
		return result;
	}
	

}
