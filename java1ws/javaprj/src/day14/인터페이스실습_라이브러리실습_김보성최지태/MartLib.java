package day14.인터페이스실습_라이브러리실습_김보성최지태;

import java.util.Scanner;

public class MartLib {
	Scanner sc = new Scanner(System.in);
	Mart mart;

	// 마트 인터페이스를 상속받는 클래스를 받고 저장하는 메서드
	public void setMart(Mart mart) {
		this.mart = mart;
	}

	// 프로그램의 시작 부분 마트를 정한다.
	public void run() {
		while (true) {
			System.out.println("마트를 정해주세요.");
			System.out.println("1.이마트, 2.홈플러스,");
			int menu = sc.nextInt();
			switch (menu) {
			case 1: {
				setMart(new EMart());
				goMart();
				return;
			}
			case 2: {
				setMart(new Homeplus());
				goMart();
				return;
			}

			default: {
				System.out.println("잘못된 입력입니다!");
			}

			}
		}
	}

	// 마트 선택 후 상품구매, 상품삭제 등 반복문으로 선택하고 끝내면 영수증이 출력 된다.
	public void goMart() {
		while (true) {
			System.out.println("메뉴를 선택하세요.");
			System.out.println("1.상품구매, 2.상품삭제, 3.끝내기(영수증 출력)");
			int menu = sc.nextInt();
			switch (menu) {
			case 1: {
				System.out.println("상품 구매 입니다.");
				System.out.print("상품의 이름을 입력하세요 : ");
				String name = sc.next();
				System.out.print("상품의 개수를 입력하세요 : ");
				int cnt = sc.nextInt();
				System.out.print("상품의 가격을 입력하세요 : ");
				int price = sc.nextInt();
				mart.addItem(name, cnt, price);
				break;
			}
			case 2: {
				System.out.println("상품삭제 입니다.");
				System.out.print("상품의 이름을 입력하세요 : ");
				String name = sc.next();
				System.out.print("상품의 개수를 입력하세요 : ");
				int cnt = sc.nextInt();
				mart.removeItem(name, cnt);
				break;
			}
			case 3: {
				String pay = setPay();
				System.out.println("영수증 출력입니다.");
				mart.printItems(pay);
				return;
			}
			}
		}
	}

	// 결제 방식을 선택하고 결제방식을 반환한다.
	public String setPay() {
		String[] pay = { "카드", "현금", "포인트 사용" };
		System.out.println("결제수단을 선택하세요.");
		for (int i = 0; i < pay.length; i++) {
			System.out.println((i + 1) + "." + pay[i] + " ");
		}
		int input = sc.nextInt();
		System.out.println(pay[input - 1] + "을(를) 사용합니다.");
		return pay[input - 1];
	}
}
