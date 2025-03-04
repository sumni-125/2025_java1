package day12.오후실습;

public class CustomerManagement2 {
	
	public static void main(String[] args) {
				Customer[] customers = new Customer[2];
		        
		        // 일반 고객과 VIP 고객 생성
		        customers[0] = new Customer("권지언", "권지언@example.com", "010-1234-5678");
		        customers[1] = new VIPCustomer("이동우", "이동우@example.com", "010-5678-1234", 15.0);
		
		        // 원래 가격 설정
		        double originalPrice = 90000.0;
		
		        // 고객 정보 출력 및 금액 계산
		        for (Customer customer : customers) {
		            customer.printCustomerInfo();
		            double finalPrice = customer.calculatePrice(originalPrice);
		            System.out.println("최종가격: " + finalPrice);
		            System.out.println();
		        }
			}
	
	

}
