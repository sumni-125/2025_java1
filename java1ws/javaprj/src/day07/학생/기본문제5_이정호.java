package day07.학생;

import java.util.Scanner;

public class 기본문제5_이정호 {

	public static void main(String[] args) {
		//어른 판단 함수
		Scanner scan = new Scanner(System.in);
		
		System.out.print("나이 입력 : ");		
		int a = scan.nextInt();
		
		boolean result = 어른판단하기(a);
		System.out.println(result);
		
		if(result == true) {
			System.out.println("술 구매 가능");
		}else {
			System.out.println("술 구매 불가능");
		}
	}

	public static String age(int a) {
		if(a > 19 && a < 150) {
			return "어른입니다.";
		}else if(a >= 0 && a <= 19) {
			return "미성년자입니다.";
		}else {
			return "나이를 제대로 입력해주세요.";
		}
	}
	
	public static boolean 어른판단하기(int a) {
		if(a > 19 && a < 150) {
			return true;
		}else if(a >= 0 && a <= 19) {
			return false;
		}else {
			throw new RuntimeException("틀린 나이");
		}
	}
}
