package day10.짝꿍실습발표.황예지윤현기_프로그램;

public class Main {
    public static void main(String[] args) {
        Bank user1 = new Bank(); // 주인1
        Bank user2 = new Bank(); // 주인2

        // 첫 번째 사용자 입금
        user1.입금("홍길동");
        
        // 두 번째 사용자 입금
        user2.입금("김철수");
        
        // 홍길동이 김철수에게 송금
        user1.송금("홍길동", user2);
        
        // 적금 테스트
        user1.적금("홍길동");
        
        // 출금 테스트
        user1.출금("홍길동");
        user2.출금("김철수");
        
        // 적금 조회
        user1.적금조회();
    }
}
