package day10.짝꿍실습발표.객체만들기프로젝트_최지태권지언;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Customer[] customers = new Customer[0]; // 고객 정보를 담을 배열 초기화

        menu(sc, customers); // 메뉴 실행
    }

    // 메뉴를 출력하고 선택에 따라 동작하는 메서드
    public static void menu(Scanner sc, Customer[] customers) {
        System.out.println("에이콘뱅크에 오신걸 환영합니다.");
        while (true) {
            System.out.println("1.로그인 2.회원가입 0.종료");
            System.out.print("메뉴를 선택하세요: ");
            int choice = sc.nextInt(); // 사용자 입력을 받음

            switch (choice) {
                case 1: { // 로그인
                    System.out.println("로그인");
                    Customer user = login(sc, customers); // 로그인 메서드 호출
                    if (user != null) {
                        accountMenu(sc, user, customers); // 로그인 성공 시 계좌 관련 메뉴 호출
                    }
                    break;
                }
                case 2: { // 회원가입
                    System.out.println("회원가입");
                    customers = signUp(sc, customers); // 회원가입 메서드 호출
                    break;
                }
                case 0: { // 종료
                    System.out.println("종료");
                    return; // 프로그램 종료
                }
                default: { // 잘못된 입력
                    System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
                    break;
                }
            }
        }
    }

    // 계좌 관련 메뉴를 처리하는 메서드
    public static void accountMenu(Scanner sc, Customer customer, Customer[] customers) {
        System.out.println(customer.getName() + "님 환영합니다.");
        while (true) {
            System.out.println("1.보유계좌확인 2.거래내역확인 3.계좌개설 4.송금 5.입금 0.로그아웃");
            System.out.print("메뉴를 선택하세요: ");
            int choice = sc.nextInt(); // 사용자 입력을 받음

            switch (choice) {
                case 1: { // 보유 계좌 확인
                    System.out.println("보유계좌확인");
                    customer.viewAccounts(); // 고객의 계좌 조회
                    break;
                }
                case 2: { // 거래 내역 확인
                    System.out.println("거래내역확인");
                    customer.viewAccounts(); // 고객의 계좌 조회
                    System.out.println("거래내역확인할 계좌번호를 입력하세요");
                    String accountNum = sc.next(); // 계좌 번호 입력
                    customer.printTransactionHistory(accountNum); // 거래 내역 출력
                    break;
                }
                case 3: { // 계좌 개설
                    System.out.println("계좌개설");
                    customer.createAccount(); // 계좌 개설 메서드 호출
                    break;
                }
                case 4: { // 송금
                    System.out.println("송금하기");
                    customer.viewAccounts(); // 보유 계좌 조회
                    System.out.println("송금 계좌번호를 입력하세요");
                    String myAccountNum = sc.next(); // 송금 계좌 번호 입력
                    Account account = customer.getAccount(myAccountNum); // 해당 계좌 찾기

                    if (account != null) {
                        System.out.println("송금할 금액을 입력하세요");
                        int money = sc.nextInt(); // 송금할 금액 입력

                        System.out.println("받는 사람 이름을 입력하세요");
                        String name = sc.next(); // 받는 사람 이름 입력
                        System.out.println("받는 사람 계좌번호를 입력하세요");
                        String accountNum = sc.next(); // 받는 사람 계좌 번호 입력
                        Customer recipient = getCustomer(customers, name, accountNum); // 수신자 찾기

                        if (recipient != null) {
                            account.transfer(money, customer.getName()); // 송금 처리
                            recipient.getAccount(accountNum).deposit(money, customer.getName()); // 수신자 입금 처리
                        } else {
                            System.out.println("수신자 정보를 확인해주세요.");
                        }
                    } else {
                        System.out.println("계좌가 없습니다.");
                    }
                    break;
                }
                case 5: { // 입금
                    System.out.println("본인 계좌에 입금");
                    customer.viewAccounts(); // 보유 계좌 조회
                    System.out.println("입금할 계좌번호를 입력하세요");
                    String myAccountNum = sc.next(); // 입금 계좌 번호 입력
                    Account account = customer.getAccount(myAccountNum); // 해당 계좌 찾기

                    if (account != null) {
                        System.out.println("입금할 금액을 입력하세요");
                        int money = sc.nextInt(); // 입금할 금액 입력
                        account.deposit(money, customer.getName()); // 입금 처리
                    } else {
                        System.out.println("계좌가 없습니다.");
                    }
                    break;
                }
                case 0: { // 로그아웃
                    System.out.println("로그아웃");
                    return; // 로그아웃
                }
                default: { // 잘못된 입력
                    System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
                    break;
                }
            }
        }
    }

    // 고객을 찾는 메서드 (이름과 계좌번호로)
    public static Customer getCustomer(Customer[] customers, String name, String accountNum) {
        for (Customer customer : customers) {
            if (customer.getName().equals(name)) {
                if (customer.getAccount(accountNum) != null) {
                    return customer; // 고객이 존재하면 반환
                }
            }
        }
        return null; // 고객이 존재하지 않으면 null 반환
    }

    // 로그인 메서드
    public static Customer login(Scanner sc, Customer[] customers) {
        System.out.print("아이디를 입력하세요: ");
        String inputId = sc.next();
        System.out.print("비밀번호를 입력하세요: ");
        String inputPw = sc.next();

        for (Customer customer : customers) {
            if (customer.checkLogin(inputId, inputPw)) {
                System.out.println("로그인 성공");
                return customer; // 로그인 성공 시 고객 객체 반환
            }
        }
        System.out.println("아이디 또는 비밀번호가 일치하지 않습니다.");
        return null; // 로그인 실패 시 null 반환
    }

    // 아이디 중복 여부 확인 메서드
    public static boolean isIdDuplicate(Customer[] customers, String id) {
        for (Customer customer : customers) {
            if (customer.getId().equals(id)) {
                return true; // 중복된 아이디 있으면 true 반환
            }
        }
        return false; // 중복된 아이디 없으면 false 반환
    }

    // 회원가입 메서드
    public static Customer[] signUp(Scanner sc, Customer[] customers) {
        System.out.println("사용자 이름을 입력하세요");
        String name = sc.next();

        String id;
        while (true) {
            System.out.println("아이디를 입력하세요");
            id = sc.next();
            if (isIdDuplicate(customers, id)) { // 아이디 중복 체크
                System.out.println("중복된 아이디 입니다. 다른 아이디 사용해주세요.");
            } else {
                break; // 중복되지 않으면 반복 종료
            }
        }

        System.out.println("비밀번호를 입력하세요");
        String pw = sc.next();

        return createCustomer(customers, name, id, pw); // 새로운 고객 객체 생성 후 반환
    }

    // 새로운 고객 객체를 생성하는 메서드
    public static Customer[] createCustomer(Customer[] customers, String name, String id, String pw) {
        Customer newCustomer = new Customer(name, id, pw); // 새로운 고객 객체 생성
        Customer[] newCustomers = new Customer[customers.length + 1]; // 기존 배열보다 하나 큰 새 배열 생성

        // 기존 배열의 데이터를 새 배열로 복사
        for (int i = 0; i < customers.length; i++) {
            newCustomers[i] = customers[i];
        }

        newCustomers[customers.length] = newCustomer; // 새 고객 추가

        System.out.println("회원가입 성공!");
        return newCustomers; // 새 배열 반환
    }
}
