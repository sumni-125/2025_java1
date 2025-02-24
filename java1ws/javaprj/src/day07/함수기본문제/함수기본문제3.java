package day07.함수기본문제;

import java.util.Scanner;

public class 함수기본문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("투자금을 입력하세요");
		int amount = sc.nextInt();
		System.out.println("투자성공 : "+investment(amount));
	}
	public static int investment(int amount) {
		amount*=2;
		return amount;
	}
}
