package day07.학생;

import java.util.Scanner;

public class Num1_1_김민환2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		for(int i=1; i<=3; i++) {
			String names;
			int price;
			
			System.out.print("사원명을 입력하세요");
			names = sc.next();
			
			System.out.print("출장비를 입력하세요");
			price = sc.nextInt();
			
			
			화폐매수구하기(names, price);
		}
		
	}
	public static void 화폐매수구하기(String names, int price) {
		
		int pricetag[] = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		String unit[] = {"오만원", "만원", "오천원", "천원", "오백원", "백원", "오십원", "십원"};
		
		for(int i=0; i<pricetag.length; i++) {
			int count = price/pricetag[i];
			if(count>0) {
				System.out.println(unit[i]+": "+ count);
			}
			price %= pricetag[i];
		}
		
	}
	
}
