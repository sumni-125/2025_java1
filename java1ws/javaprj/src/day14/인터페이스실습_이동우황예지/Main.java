package day14.인터페이스실습_이동우황예지;

import java.util.Scanner;

public class Main {
	
	public void run() {
		Scanner sc = new Scanner(System.in);
		Delivery ov = new Overseas();
		Delivery ds = new Domestic();
		
		loop:while(true) {
			System.out.println("1. 해외  2. 국내  3. 종료");
			int menu = sc.nextInt();
			switch(menu){
			case 1:
				System.out.println("해외 전용 배송란입니다.");
				ov.productCnt();
				System.out.println("배송지역은 usa(united states)  /  europe  / america 입니다.");
				ov.transportation();
				
				int ovDeliveryTime = ov.getDeliveryTime();
				System.out.println("배송기간은 약 "+ovDeliveryTime+"일 입니다.");
				break;
				
			case 2:
				System.out.println("국내 전용 배송란입니다.");
				ds.productCnt();
				ds.transportation();
				int dsDeliveryTime = ds.getDeliveryTime();
				System.out.println("배송기간은 약 "+dsDeliveryTime+"일 입니다.");
				break;
				
			case 3:
				System.out.println("종료합니다.");
				break loop;
			default :
				System.out.println("정확한 번호를 다시 입력해주세요");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m = new Main();
		
		m.run();
		
		
		
		
		
		
		
		
	}

}

//기능

//제품
//1. 보조배터리 장사 == 12000원

//2. 수량을 입력 (사용자가 입력)

//3. 총 금액 (내가 구함)

//4. 배송지역에 따른 배송비 (국내면 0원 / 해외면 5000원


//운송수단
//5. 배송지역에 따른 운송수단 (해외면 비행기로 운송 / 국내면 트럭으로 운송)
// => 유효성 검사 (지역이 서울인지? 해외인지?)
// => 주소지 입력 받기

//6. 거리에 따라 배송기간
// => 만약 해외중에도 아메리카다 그러면 30일;
// => 



//총 정리
/*
 사용자가 물건을 주문하면
  => 물품이름과 가격, 수량, (배송비 포함 가격)총금액
  
  => 지역에 따라 배송기간

 */


