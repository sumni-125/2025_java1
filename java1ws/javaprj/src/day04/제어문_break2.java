package day04;

import java.util.Scanner;

public class 제어문_break2 {

	public static void main(String[] args) {

		//메뉴 1.조회 2.등록 3.변경 4.종료
		//반복해서 메뉴를 사용할 수 있도록 반복문으로 구성함
		//종료(4번)선택하면 프로그램이 종료될 수 있ㄷ록 하자
		
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		
		loop: while(true) {
			System.out.println("메뉴 1.조회 2.등록 3.변경 4.종료");
			menu = sc.nextInt();
			switch (menu) {
			case 1:
				System.out.println("조회합니다...");
				break;
			case 2:
				System.out.println("등록합니다...");
				break;
			case 3:
				System.out.println("변경합니다...");
				break;
			case 4:
				System.out.println("종료합니다...");
				break loop;
			default:
				System.out.println("메뉴가잘못됨");
				
			
			
			}
		}
		
		
		

	}

}
