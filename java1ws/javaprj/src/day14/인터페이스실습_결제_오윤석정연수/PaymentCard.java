package day14.인터페이스실습_결제_오윤석정연수;

import java.util.ArrayList;
import java.util.Scanner;

public class PaymentCard  implements Payment {
	CreditCard card = new CreditCard("1234-5678-9101-1123", 1234, 987, 10000);
	Scanner sc = new Scanner(System.in);
	Payment payment;
	String selectProduct;
	String cardNum;
	int pwd;
	int code;
	ArrayList<Product> basket = new ArrayList<>();
	int totalSum = 0;
	
	int index;
	
//	SelectProduct see = new SelectProduct();
	
	
	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	@Override
	public void paymentMethod(int totalSum) {
		
//		SelectProduct see = new SelectProduct();
//	    see.secProduct();
		
		System.out.println("카드번호를 입력해주세요");

		loop:while(true) {
			cardNum = sc.next();
			if(cardNum.equals(card.getCardNum())) {
				System.out.println("카드번호 확인되었습니다");
				break loop;
			}else {
				System.out.println("카드번호를 다시 확인해주세요");
			}
		}
		System.out.println("비밀번호를 입력해주세요");
		loop:while(true) {
			pwd = sc.nextInt();
			if(pwd == card.getCardPwd()) {
				System.out.println("비밀번호 확인되었습니다");
				break loop;
			}else {
				System.out.println("비밀번호를 다시 확인해주세요");
			}
		}
		System.out.println("보안코드를 입력해주세요");
		loop:while(true) {
			code = sc.nextInt();
			if(code == card.getSecNum()) {
				System.out.println("보안코드 확인되었습니다");
				break loop;
			}else {
				System.out.println("보안코드를 다시 확인해주세요");
			}
		}
		
		System.out.println("결제를 시작합니다");
		
		card.setMoney(card.getMoney() - totalSum);
		System.out.println("결제완료");
		System.out.println("남은잔액: " + card.getMoney());
		
		
	
																				
		
	}

}
