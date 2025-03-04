// Customer 클래스

package day12.오후실습;

class Customer {
    private String name;
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

    // 결제 금액 계산 메서드 (할인 없음)
    public double calculatePrice(double originalPrice) {
        return originalPrice; // 할인 없음, 원래 금액 반환
    }
}
