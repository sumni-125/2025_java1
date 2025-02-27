package day10.짝꿍실습발표.객체만들기프로젝트_최지태권지언;

public class Customer {
    private String name;  // 고객 이름
    private String id;    // 고객 아이디
    private String pw;    // 고객 비밀번호
    private Account[] accounts;  // 고객의 계좌 목록

    // 생성자: 고객 객체를 생성할 때 호출
    public Customer(String name, String id, String pw) {
        this.name = name;
        this.id = id;
        this.pw = pw;
        this.accounts = new Account[0];  // 초기에는 계좌가 없으므로 빈 배열로 초기화
        System.out.println("고객 생성 완료!");  // 고객 생성 완료 메시지 출력
    }

    // 고객의 이름을 반환
    public String getName() {
        return this.name;
    }

    // 고객의 아이디를 반환
    public String getId() {
        return this.id;
    }

    // 계좌번호로 계좌를 찾아 반환
    public Account getAccount(String accountNum) {
        for (Account account : accounts) {
            if (account.getAccountNum().equals(accountNum)) {
                return account;  // 계좌번호가 일치하는 계좌 반환
            }
        }
        return null;  // 일치하는 계좌가 없으면 null 반환
    }

    // 계좌 번호를 입력받아 해당 계좌의 거래 내역을 출력
    public void printTransactionHistory(String accountNum) {
        Account account = getAccount(accountNum);  // 계좌 조회
        if (account != null) {
            account.printHistory();  // 계좌가 있으면 거래 내역 출력
        } else {
            System.out.println("계좌번호를 확인해주세요.");  // 계좌가 없으면 메시지 출력
        }
    }

    // 로그인 체크 (아이디와 비밀번호가 맞는지 확인)
    public boolean checkLogin(String id, String pw) {
        return this.id.equals(id) && this.pw.equals(pw);  // 아이디와 비밀번호가 일치하면 true 반환
    }

    // 새 계좌 생성
    public void createAccount() {
        String accountNum = generateAccountNum();  // 계좌 번호 생성
        System.out.println("계좌 생성 완료: " + accountNum);  // 계좌 생성 완료 메시지 출력
        Account newAccount = new Account(accountNum);  // 새 계좌 객체 생성

        // 계좌 배열을 확장하여 새 계좌 추가
        Account[] newAccounts = new Account[accounts.length + 1];  // 기존 계좌 배열보다 1개 큰 배열 생성
        System.arraycopy(accounts, 0, newAccounts, 0, accounts.length);  // 기존 계좌 배열의 내용 복사
        newAccounts[accounts.length] = newAccount;  // 새 계좌 추가
        accounts = newAccounts;  // 새 배열로 교체

        displayAccounts();  // 새 계좌 목록을 출력
    }

    // 12자리의 랜덤 계좌 번호를 생성하는 메서드
    private String generateAccountNum() {
        StringBuilder sb = new StringBuilder();  // 계좌 번호를 만들기 위한 StringBuilder 객체 생성
        for (int i = 0; i < 12; i++) {
            sb.append((int) (Math.random() * 10));  // 0부터 9까지의 숫자 중 랜덤으로 12자리 숫자 생성
        }
        return sb.toString();  // 생성된 계좌 번호 반환
    }

    // 고객의 보유 계좌 목록을 출력
    public void viewAccounts() {
        System.out.println("\n===== 계좌 조회 =====");
        if (accounts.length == 0) {
            System.out.println("계좌가 없습니다.");  // 계좌가 없으면 메시지 출력
        } else {
            for (int i = 0; i < accounts.length; i++) {
                System.out.println((i + 1) + ". 계좌번호: " + accounts[i].getAccountNum());  // 각 계좌 번호 출력
            }
            System.out.println("총 계좌 수 : " + accounts.length);  // 계좌 수 출력
        }
    }

    // 현재 고객이 보유한 계좌 목록을 출력
    private void displayAccounts() {
        System.out.println("\n현재 계좌 목록:");
        for (int i = 0; i < accounts.length; i++) {
            System.out.println((i + 1) + ". " + accounts[i].getAccountNum());  // 계좌 번호 출력
        }
        System.out.println("총 계좌 수 : " + accounts.length);  // 총 계좌 수 출력
    }
}
