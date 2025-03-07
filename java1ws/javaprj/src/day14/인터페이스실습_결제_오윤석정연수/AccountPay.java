package day14.인터페이스실습_결제_오윤석정연수;

import java.util.Scanner;

public class AccountPay implements Payment {

    Account account;

    public AccountPay(Account account) {
        this.account = account;
    }

    @Override
    public void paymentMethod(int totalSum) { // 매개변수 추가
        Scanner sc = new Scanner(System.in);

        // 계좌변호 입력받기
        while (true) {
            System.out.print("계좌번호 입력:");
            String inputnum = sc.nextLine();

            // 계좌번호 검증
            if (!inputnum.equals(account.getAccNum())) {
                System.out.println("계좌번호를 다시 입력해주세요");
            } else {
                break;
            }
        }

        // 비밀번호 입력받기
        while (true) {
            System.out.print("비밀번호 입력: ");
            String inputPwd = sc.nextLine();

            // 비밀번호 검증
            if (!account.check(inputPwd)) {
                System.out.println("비밀번호가 틀렸습니다");
            } else {
                break;
            }
        }

        // 결제 처리 (이체 금액을 입력받는 대신 전달받은 totalSum 사용)
        account.pay(totalSum);
        System.out.println("결제 금액: " + totalSum);
        System.out.println("남은잔액: " + account.getMoney());
    }
}
