package day10.짝꿍실습발표;

import java.util.Scanner;

public class 자판기출력2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		자판기[] pocketmenu = new 자판기[4];
		int index = 0;
		int sum=0;
		
		
		
		loop: while (true) {
			System.out.println("===============================");
			System.out.println("원하는 제품을 입력하시오 1.데미소다, 2.파워에이드, 3.포스틱, 4.양파링 5.종료");
			int menu = sc.nextInt();

			switch (menu) {

			case 1:
				자판기 s = new 자판기();
				s.beverageInfo("데미소다", 1000, 500, 300, "사과맛", "농심", "2025-02-26");
				sum+=s.beverageInfoOut();
				pocketmenu[index] = s;
				index++;
				
				break;

			case 2:
				자판기 s2 = new 자판기();
				s2.beverageInfo("파워에이드", 1500, 700, 100, "레몬에이드", "오리온", "2025-02-27");
				sum+=s2.beverageInfoOut();
				pocketmenu[index] = s2;
				index++;
				
				break;

			case 3:

				자판기 s3 = new 자판기();
				s3.snackInfo("포스틱", 1700, 100, 30, "감자", "오리온", "2025-02-28");
				sum+=s3.snackInfoOut();
				pocketmenu[index] = s3;
				index++;
				
				break;

			case 4:

				자판기 s4 = new 자판기();
				s4.snackInfo("양파링", 1300, 80, 20, "양파", "농심", "2025-02-27");
				sum+=s4.snackInfoOut();
				pocketmenu[index] = s4;
				index++;
				
				break;

			case 5:
				System.out.println("구매를 종료합니다");
				break loop;

			default:
				System.out.println("없는 메뉴입니다");

			}
		}
		System.out.println("===============================");
		System.out.println("내 주머니에 들어있는 것들");
		for (int i = 0; i < index; i++) {
			System.out.println((i+1)+". "+pocketmenu[i].name);
		}
		
		System.out.println("거스름돈의 총합은: "+ sum +"입니다");


	}
}
