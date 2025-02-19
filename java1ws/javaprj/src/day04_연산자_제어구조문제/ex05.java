package day04_연산자_제어구조문제;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		// 5. 일정을 관리프로그램 만들기 (1번)
	    //(1.등록, 2.조회, 3.변경, 4.삭제)
		
		int code;
		Scanner sc = new Scanner(System.in);
		System.out.println("1.등록, 2.조회, 3.변경, 4.삭제");
		code=sc.nextInt();
		
		
		
		switch(code) {
		
		case 1:
			System.out.println("등록");
			break;
		case 2:
			System.out.println("조회");
			break;
		
		case 3:
			System.out.println("변경");
			break;
		
		case 4:
			System.out.println("삭제");
			break;
		default:
			System.out.println("번호를 다시 입력하세요");
			break;
		
		}
	}

}
