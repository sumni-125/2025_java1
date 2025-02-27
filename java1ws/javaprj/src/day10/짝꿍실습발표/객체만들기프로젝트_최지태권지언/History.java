package day10.짝꿍실습발표.객체만들기프로젝트_최지태권지언;

public class History {
	private String transaction; // 거래 종류 (입금, 출금 등)
	private int price; // 거래 금액
	private String sender; // 송금자
	private String date; // 거래 날짜
	private int balance; // 거래 후 잔액

	// 생성자: 거래 정보 초기화
	public History(String transaction, int price, String sender, String date, int balance) {
		this.transaction = transaction; // 거래 종류
		this.price = price; // 거래 금액
		this.sender = sender; // 송금자 이름
		this.date = date; // 거래 날짜
		this.balance = balance; // 거래 후 잔액
	}

	// 거래 내역 출력 메서드
	public void printHistory() {
		// 각 항목을 탭으로 구분하여 출력
		System.out.print(this.transaction + "\t"); // 거래 종류
		System.out.print(this.price + "\t"); // 거래 금액
		System.out.print(this.sender + "\t"); // 송금자 또는 입금자 이름
		System.out.print(this.date + "\t"); // 거래 날짜
		System.out.print(this.balance + "\n"); // 거래 후 잔액
	}
}
