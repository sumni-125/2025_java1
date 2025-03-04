package day12.상속.샘플;

public class CustomerManagement {
	
	public static void main(String[] args) {
				 
		        
		        // 일반 고객과 VIP 고객 생성
		        Customer c= new Customer("권지언", "권지언@example.com", "010-1234-5678");
		        VIPCustomer v = new VIPCustomer("이동우", "이동우@example.com", "010-5678-1234", 15.0);
		 
		        
		        c.printCustomerInfo();
		        v.vipPrintCustomerInfo();
		        
		        
		       
			}
	
	

}
