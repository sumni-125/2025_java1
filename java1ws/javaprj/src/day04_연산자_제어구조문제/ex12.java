package day04_연산자_제어구조문제;

import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		// 12.  주문수량, 메뉴를 입력받아
	    //  해당 주문의 주문금액을 출력하는 프로그램 작성하시오     
	    //  ( 메뉴, 가격 임의로 정하기 )
		
		int menuNum, total_price=0, quantity;
		
		Scanner sc = new Scanner(System.in);
		
		order: while(true) {
			
			System.out.println("메뉴 번호를 입력하세요");
			System.out.println("1. 아메리카노, 2. 카페라떼, 3. 모카라떼, 4. 종료");
			
			menuNum = sc.nextInt();
			
			switch(menuNum) {
			
			case 1:
				System.out.println("메뉴 갯수를 입력하세요");
				quantity = sc.nextInt();
				
				total_price = 1000 * quantity;
				System.out.println("총 금액은 "+total_price+"원 입니다");
				break;
				
			case 2:
				System.out.println("메뉴 갯수를 입력하세요");
				quantity = sc.nextInt();
				
				total_price = 2000 * quantity;
				System.out.println("총 금액은 "+total_price+"원 입니다");
				break;
				
			case 3:
				System.out.println("메뉴 갯수를 입력하세요");
				quantity = sc.nextInt();
				
				total_price = 3000 * quantity;
				System.out.println("총 금액은 "+total_price+"원 입니다");
				break ;
			case 4:
				System.out.println("종료합니다.");
				
				break order;
			default:
				System.out.println("알맞은 메뉴 번호를 입력하세요");
				
				break;
			}
			
			
		}
		
		
	}

}
