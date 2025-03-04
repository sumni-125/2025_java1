package day12.오후실습;

public class CustomerManagement {
    public static void main(String[] args) {
        // 일반 고객 생성
        Customer customer1 = new Customer("권지언", "권지언@example.com", "010-1234-5678");

        // VIP 고객 생성
        VIPCustomer vipCustomer1 = new VIPCustomer("이동우", "이동우@example.com", "010-5678-1234", 15.0);

        // 고객 정보 출력
        System.out.println("고객정보출력");
        customer1.printCustomerInfo();
        System.out.println();

    
        vipCustomer1.printCustomerInfo();
        System.out.println();

        // 금액 계산
        double originalPrice = 90000.0; // 
        double customerPrice = customer1.calculatePrice(originalPrice);
        double vipCustomerPrice = vipCustomer1.calculatePrice(originalPrice);

        System.out.println("가격: " + originalPrice);
        System.out.println("일반고객 가격:  " + customerPrice);
        System.out.println("VIP고객 가격:  " + vipCustomerPrice); 
        
        
        
        
    }
}