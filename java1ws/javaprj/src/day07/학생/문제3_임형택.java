package day07.학생;

import java.util.Scanner;

public class 문제3_임형택 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("투자금을 입력하십시오");
		int seed = sc.nextInt();
		
		System.out.println("투자에 성공하셨습니다 ! 원금 두배 !"+"  "+투자금두배(seed));
		
	}
	
	public static int 투자금두배(int seed) {
		int money = seed*2;
		return money;
	}
}
