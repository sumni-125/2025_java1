// Customer 클래스

package day12.상속.샘플;

public class Customer {
    protected String name;   //같은패키지 접근허용,  다른패키지에 있어도 접근을 허용한다. ( 상속받은 클래스인경우  )  
    private String email;
    private String phoneNumber;
 
    // 생성자
    public Customer(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // Getter와 Setter
    // toString
    
    // 고객 정보 출력 메서드
    public void printCustomerInfo() {
        System.out.println("이름: " + name);
        System.out.println("이메일: " + email);
        System.out.println("전화번호: " + phoneNumber);
    }

    
}
