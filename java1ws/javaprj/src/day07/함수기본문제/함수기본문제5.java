package day07.함수기본문제;

import java.util.Scanner;

public class 함수기본문제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int age = sc.nextInt();
		
	}
	public static void adult(int age) {
		if(age>=20) {
			System.out.println("성인입니다.");
		}else {
			System.out.println("성인이 아님.");
		}
	}
}
