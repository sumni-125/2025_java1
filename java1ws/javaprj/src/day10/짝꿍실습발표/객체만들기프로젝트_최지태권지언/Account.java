package day10.짝꿍실습발표.객체만들기프로젝트_최지태권지언;

import java.util.Calendar;

public class Account {
	private int balance = 0; // 계좌의 잔액
	private final String accountNum; // 계좌 번호
	private History[] history; // 거래 내역을 저장할 배열

	// 계좌 번호를 반환하는 메서드
	public String getAccountNum() {
		return this.accountNum;
	}

	// 생성자: 계좌 번호를 받아 계좌 객체 생성
	public Account(String accountNum) {
		this.accountNum = accountNum;
		this.history = new History[0]; // 초기 거래 내역 배열 크기 설정
	}

	// 현재 날짜와 시간을 "yyyy/MM/dd HH:mm" 형식으로 반환하는 메서드
	private String getNow() {
		Calendar cal = Calendar.getInstance(); // 현재 날짜와 시간을 얻기 위한 Calendar 객체 생성
		return String.format("%d/%02d/%02d %02d:%02d", 
				cal.get(Calendar.YEAR), // 현재 연도
				cal.get(Calendar.MONTH) + 1, // 현재 월 (0부터 시작하므로 1을 더함)
				cal.get(Calendar.DATE), // 현재 날짜
				cal.get(Calendar.HOUR_OF_DAY), // 현재 시각 (24시간 형식)
				cal.get(Calendar.MINUTE)); // 현재 분
	}

	// 송금이 가능한지 확인하는 메서드
	private boolean canTransfer(int price) {
		if (this.balance < price) { // 잔액이 송금액보다 적으면 송금 불가
			System.out.println("잔액이 부족합니다!"); // 부족한 잔액 메시지 출력
			return false;
		}
		return true; // 잔액이 충분하면 송금 가능
	}

	// 송금 메서드: 송금액과 송금자의 이름을 입력받아 송금을 진행
	public void transfer(int price, String senderName) {
		if (!canTransfer(price))
			return; // 잔액 부족시 송금 취소
		this.balance -= price; // 송금액만큼 잔액 차감
		makeHistory("출금", price, senderName); // 거래 내역 생성
		System.out.println("송금 완료! 현재 잔액: " + this.balance); // 송금 완료 메시지 출력
	}

	// 입금 메서드: 입금액과 입금자의 이름을 입력받아 입금을 진행
	public void deposit(int price, String recipientName) {
		if (price <= 0) { // 입금 금액이 0 이하인 경우, 유효하지 않음
			System.out.println("입금 금액이 올바르지 않습니다.");
			return;
		}
		this.balance += price; // 입금액만큼 잔액 증가
		makeHistory("입금", price, recipientName); // 거래 내역 생성
		System.out.println("입금 완료! 현재 잔액: " + this.balance); // 입금 완료 메시지 출력
	}

	// 본인 계좌에 입금 메서드
	public void depositToSelf(int price) {
		if (price <= 0) { // 입금 금액이 0 이하인 경우, 유효하지 않음
			System.out.println("입금 금액이 올바르지 않습니다.");
			return;
		}
		this.balance += price; // 입금액만큼 잔액 증가
		makeHistory("입금(본인 계좌)", price, "본인"); // 거래 내역 생성
		System.out.println("본인 계좌에 입금 완료! 현재 잔액: " + this.balance); // 입금 완료 메시지 출력
	}

	// 거래 내역을 출력하는 메서드
	public void printHistory() {
		if (this.history == null || this.history.length == 0) { // 거래 내역이 없다면
			System.out.println("거래내역이 없습니다!");
			return;
		}
		// 거래 내역 표 출력
		System.out.println("============================================================");
		System.out.println("입출금여부\t거래금액\t입금자명\t거래날짜\t\t\t잔액");
		System.out.println("============================================================");
		for (History h : this.history) { // 거래 내역 배열을 순차적으로 출력
			if (h != null) {
				h.printHistory(); // 거래 내역 객체의 상세 출력
			}
		}
		System.out.println("============================================================");
	}

	// 거래 내역을 생성하는 메서드
	private void makeHistory(String transaction, int price, String sender) {
		History newHistory = new History(transaction, price, sender, getNow(), this.balance); // 새로운 거래 내역을 만들기
		History[] newHistories = new History[history.length + 1]; // 기존 배열 크기보다 1칸 큰 배열 생성

		// 기존 거래 내역을 새 배열로 하나씩 복사
		for (int i = 0; i < history.length; i++) {
			newHistories[i] = history[i];
		}

		newHistories[history.length] = newHistory; // 새 거래 내역을 마지막에 추가

		history = newHistories; // 기존 history 배열을 새 배열로 교체
	}

}
