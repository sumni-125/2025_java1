package day14.인터페이스실습_이동우황예지;

import java.util.Scanner;
import java.util.regex.Pattern;

// 해외 배송 클래스
public class Overseas implements Delivery {  
	String address;
    Scanner sc = new Scanner(System.in);
    Product pd = new Product();  

    @Override
    // 제품 수량 및 배송비 계산
    public void productCnt() {
        System.out.println("상품: " + pd.getName() + " | 가격: " + pd.getPrice() + "원");
        System.out.println("수량을 입력해 주세요, 5개 이상이면 무료배송입니다.");
        
        int inCnt = sc.nextInt();  // 사용자 입력
        
        if (inCnt >= 5) {
            System.out.println("배송비가 무료입니다.");
            System.out.println("총 금액: " + (pd.getPrice() * inCnt) + "원 입니다.");
        } else {
            int deliveryFee = pd.getDeliveryFee() + 5000; // 배송비 추가
            System.out.println("배송비: " + deliveryFee + "원 추가 결제됩니다.");
            System.out.println("총 금액: " + (pd.getPrice() * inCnt + deliveryFee) + "원 입니다.");
        }
    }

    
    @Override
    public void transportation() {
        //주소 입력받고 유효성 검사
        
        while (true) {
            System.out.println("주소를 입력해 주세요:");
            address = sc.next();  // 사용자 입력
            
            // 주소 유효성 검사 (영어로만 입력했는지)
            if (isAlphanumeric(address)) {
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
                System.out.println("잘못 입력된 주소입니다. 영어로 입력해주세요.");
            }
        }
    }
    // 영어가 입력되었는지 유효성 검사
    public boolean isAlphanumeric(String str) {    
        return Pattern.matches("[a-zA-Z0-9]*", str);
 
    }

    //배송기간
	@Override
	public int getDeliveryTime() {
		if(address.contains("usa") || address.contains("united states")){
			return 10;
		} else if(address.contains("europe")) {
			return 14;
		}else if(address.contains("america")){
			return 30;
		}else {
			return 21; //나머지지역
		}
		
	}


}