package day12.상속.샘플;

// VIPCustomer 클래스 (Customer 클래스 상속)

public class VIPCustomer extends Customer {
    private double discountRate;

    // 생성자
    public VIPCustomer(String name, String email, String phoneNumber, double discountRate) {
        super(name, email, phoneNumber);
        
        
        this.discountRate = discountRate;
    }

  
    
    public void vipPrintCustomerInfo() {
       System.out.println("이름: " + name);
      //   System.out.println("이메일: " + email);
       //.out.println("전화번호: " + phoneNumber);
    	
    	
    	printCustomerInfo();
    	
    	System.out.println("전화번호: " + discountRate);
    }

   
}


