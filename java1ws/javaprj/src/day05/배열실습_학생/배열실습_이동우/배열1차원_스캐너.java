package day05.배열실습_학생.배열실습_이동우;

import java.util.Scanner;

public class 배열1차원_스캐너 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[] menu = new String[3];
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("음식을 3개를 적어주세요.");	
		
		for(int i = 0; i < menu.length; i++) {

			menu[i] = sc.nextLine();
			
		}

			System.out.println("당신이 음식은 " + menu[0] + ", " + menu[1]+ ", " + menu[2] + " 입니다.");

		
		
	}

}
