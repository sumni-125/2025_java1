package day12.오후실습;

// VIPCustomer 클래스 (Customer 클래스 상속)

class VIPCustomer extends Customer {
    private double discountRate;

    // 생성자
    public VIPCustomer(String name, String email, String phoneNumber, double discountRate) {
        super(name, email, phoneNumber);
        this.discountRate = discountRate;
    }

    //쎄터게터

    // 할인된 금액 계산 메서드 (오버라이드)
    @Override
    public double calculatePrice(double originalPrice) {
        return originalPrice * (1 - discountRate / 100);
    }

    // VIP 고객 정보 출력 메서드 (오버라이드)
    @Override
    public void printCustomerInfo() {
        super.printCustomerInfo();  //부모의 매서드 호출
        
       
        System.out.println("할인율: " + discountRate + "%");
    }
}


