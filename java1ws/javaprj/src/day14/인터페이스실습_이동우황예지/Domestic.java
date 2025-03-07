package day14.인터페이스실습_이동우황예지;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Domestic implements Delivery {

	Scanner sc = new Scanner(System.in);

	String address;
	Product pd = new Product();

	//제품 정보 출력 및 수량 / 총금액 출력할 부분
	@Override
	public void productCnt() {   
		pd.setName("보조배터리");
		System.out.println("상품: " + pd.getName() + " | 가격: " + pd.getPrice() + "원");
		System.out.println("수량을 입력해 주세요. 5개 이상 구매해주시면 사은품을 드립니다.");

		int inCnt = sc.nextInt(); // 사용자 입력

		if (inCnt <= 5) {
			System.out.println("1m c타입 케이블을 드립니다.");
			System.out.println("총 금액: " + (pd.getPrice() * inCnt) + "원 입니다.");
		} else {
			System.out.println("1m c타입 케이블 사은품을 1+1을 드립니다.");
			System.out.println("총 금액: " + (pd.getPrice() * inCnt) + "원 입니다.");
		}

	}

	//배송 정보 입력 부분
	@Override
	public void transportation() {
	        
	        while (true) {
	            System.out.println("주소를 입력해 주세요:");
	            address = sc.next();  // 사용자 입력
	            
	            // 주소 유효성 검사 (한글로만 입력했는지)
	            if (isKorean(address)) {
	                System.out.println("이 주소지가 맞나요? (네/yes 또는 아니요/no 입력)");
	                System.out.println("입력한 주소: " + address);
	                
	                String answer = sc.next();
	                //equalsIgnoreCase = 대소문자를 구분하지 않기 위해 사용
	                if (answer.equals("네") || answer.equalsIgnoreCase("yes")) {
	                    System.out.println("이 배송지로 배송해드리겠습니다.");
	                    break;  
	                } else if (answer.equals("아니요") || answer.equalsIgnoreCase("no")) {
	                    System.out.println("주소를 다시 입력해 주세요.");
	                } else {
	                    System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
	                }
	            } else {
	                System.out.println("잘못 입력된 주소입니다.다시 입력해 주세요");
	            }
	        }
	    }
	    // 한글이 입력되었는지 유효성 검사
	    public boolean isKorean(String str) {    
	    	return Pattern.matches("[가-힣]*$", str);

	    }

	    //배송기간 정보
		@Override
		public int getDeliveryTime() {
			if(address.contains("서울")){
				return 0;
			} else if(address.contains("경기")) {
				return 1;
			}else if(address.contains("제주")){
				return 5;
			}else {
				return 2; //나머지지역
			}
		}
	

}

