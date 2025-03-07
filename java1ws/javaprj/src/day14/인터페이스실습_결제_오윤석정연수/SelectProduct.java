package day14.인터페이스실습_결제_오윤석정연수;

import java.util.ArrayList;
import java.util.Scanner;

public class SelectProduct {

	Scanner sc = new Scanner(System.in);
	Payment c;
	String selectProduct;
	String secPayMethod;
	int totalSum = 0;
	ArrayList<Product> basket = new ArrayList<>();
	public void secProduct() {
        ProductList p = new ProductList();
		
		ArrayList<Product> products = p.makeList();
		
		System.out.println("상품결제 시스템에 오신것을 환영합니다");
		loop:while(true) {
			System.out.println("구매하실 상품을 선택해주세요");
			System.out.println("상품선택 종료를 원하시면 종료를 입력해주세요");
			System.out.println(products.toString());
			
			
			selectProduct = sc.next();
			if(selectProduct.equals("종료")) {
				System.out.println("상품선택을 종료합니다");
				break loop;
				
			}
			boolean found = false;
			for(int i=0; i<products.size(); i++) {
				Product pr = products.get(i);
				if(selectProduct.equals(pr.getName())) {
					basket.add(pr);
					totalSum = totalSum + pr.getPrice();
					found = true;
					break;
					
				}
				
			}
			if(!found) {
		        System.out.println("잘못입력하셨습니다");
		    }
			
			System.out.println("현재 장바구니 목록: " + basket.toString());
			System.out.println("총 가격: " + totalSum);
			
			
		}
		
		
		
		System.out.println("결제방식을 선택해주세요");
		System.out.println("카드결제 또는 계좌이체 결제중 원하시는 방식을 입력해주세요");
		secPayMethod = sc.next();
		switch(secPayMethod) {
		case "카드결제":
			c = new PaymentCard();
			 c.paymentMethod(getTotalSum());
			 break;
		case "계좌이체":
		    Account account = new Account("1234-5678", "김개똥", 50000, "1234");
		  //  AccountPay accountPay = new AccountPay(account);
		    c = new AccountPay(account);
		    c.paymentMethod(getTotalSum());
		    break;
		default:
		    System.out.println("잘못된 결제 방식을 선택하셨습니다.");
		}
		
		
	}
	
	public ArrayList<Product> getBasket(){
		return basket;
	}
	public int getTotalSum() {
		return totalSum;
	}
	public void setTotalSum(int totalSum) {
		this.totalSum = totalSum;
	}
	

}
