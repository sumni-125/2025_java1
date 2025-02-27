package day10.짝꿍실습발표.황예지윤현기_프로그램;

import java.util.Scanner;

public class Bank {
	Scanner sc = new Scanner(System.in);

	String ownerName;
	int money;
	int pwd;
	int account;
	double savingAccount = 0;  // 적금 계좌 추가

	// 입금 메서드
	public void 입금(String ownerName) {
		this.ownerName = ownerName;
		System.out.println("안녕하세요 "+ownerName+"님");
		System.out.println("비밀번호를 입력하세요");
		pwd = sc.nextInt();
		
		if(pwd==1234) {
			System.out.println("인증성공!");
			System.out.println("입금하실 금액을 입력하세요");
			money = sc.nextInt();
			account += money;
			System.out.println(this.ownerName+"님의 현재 잔액은 "+this.account+"원입니다");
		} else {
			System.out.println("비밀번호가 틀렸습니다");
		}
	}

	// 출금 메서드
	public void 출금(String ownerName) {
		this.ownerName = ownerName;
		System.out.println("안녕하세요 "+ownerName+"님");
		System.out.println("비밀번호를 입력하세요");
		pwd = sc.nextInt();
		
		if(pwd==1234) {
			System.out.println("인증성공!");
			System.out.println("출금하실 금액을 입력하세요");
			money = sc.nextInt();
			
			if(account >= money) {
				account -= money;
				System.out.println(money + "원이 출금되었습니다.");
				System.out.println(this.ownerName+"님의 현재 잔액은 "+this.account+"원입니다");
			} else {
				System.out.println("잔액이 부족합니다.");
				System.out.println("현재 잔액: " + account + "원");
			}
		}else {
			System.out.println("비밀번호가 틀렸습니다");
		}
	}

	//  송금 메서드 추가
	//  Bank receiver 매개변수는 Bank 클래스의 인스턴스(객체)를 받아옴.
	public void 송금(String ownerName, Bank receiver) {

		this.ownerName = ownerName;
		System.out.println("안녕하세요 "+ownerName+"님");
		System.out.println("비밀번호를 입력하세요");
		pwd = sc.nextInt();
		
		if(pwd==1234) {
			System.out.println("인증성공!");
			System.out.println("송금하실 금액을 입력하세요");
			money = sc.nextInt();
			
			if(account >= money) { // 계좌에 있는 금액이 money보다 같거나 클 경우
				account -= money;  // 보내는 사람 계좌에서 차감
				receiver.account += money;  // 받는 사람 계좌에 추가
				System.out.println(money + "원이 " + receiver.ownerName + "님께 송금되었습니다.");
				System.out.println(this.ownerName+"님의 현재 잔액은 "+this.account+"원입니다");
			} else {
				System.out.println("잔액이 부족합니다.");
				System.out.println("현재 잔액: " + account + "원");
			}
		}else {
			System.out.println("비밀번호가 틀렸습니다");
		}
	}

	// 적금 메서드
	public void 적금(String ownerName) {
		this.ownerName = ownerName;
		System.out.println("안녕하세요 "+ownerName+"님");
		System.out.println("비밀번호를 입력하세요");
		pwd = sc.nextInt();
		
		if(pwd==1234) {
			System.out.println("인증성공!");
			System.out.println("적금계좌에 넣을 금액을 입력하세요");
			money = sc.nextInt();
			
			if(money <= account && money >= 0) {
				account -= money;  // 일반 계좌에서 차감
				savingAccount += money;  // 적금 계좌에 추가
				System.out.println("적금 계좌에 "+money+"원이 입금되었습니다.");
				적금조회();
				
				// 적금 금액이 10만원 이상이면 이자 2% 추가
				if(savingAccount >= 100000) {
					savingAccount *= 1.02;
					System.out.println("이자 2% 입금되었습니다");
					적금조회();
				}
			} else {
				System.out.println("현재 계좌에 있는 금액보다 많습니다.");
				System.out.println("");
			}
		} else {
			System.out.println("비밀번호가 틀렸습니다");
		}
	}

	// 적금 조회 메서드 추가
	public void 적금조회() {
		System.out.println(ownerName+"님의 적금금액은 "+(int)savingAccount+"원입니다.");
		System.out.println("");
	}
}
