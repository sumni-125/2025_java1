package day14.인터페이스실습_결제_오윤석정연수;

import java.util.Scanner;

public class Account {

	Scanner sc = new Scanner(System.in);

	private String accNum;
	private String accOwner;
	private int money;
	private String pwd;

	public Account(String accNum, String accOwner, int money, String pwd) {
		this.accNum = accNum;
		this.accOwner = accOwner;
		this.money = money;
		this.pwd = pwd;
	}

	public String getAccNum() {
		return accNum;
	}

	public int getMoney() {
		return money;
	}

	public boolean check(String inputPwd) {
		return this.pwd.equals(inputPwd);
	}

	public void pay(int amount) {
		if (money >= amount) {
			money -= amount;
			System.out.println("계좌이체가 완료되었습니다");
		} else {
			System.out.println("잔액이 부족합니다");
		}
	}

}
