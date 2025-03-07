package day14.인터페이스실습_결제_오윤석정연수;

public class CreditCard {
	
	String cardNum;
	int cardPwd;
	int secNum;
	int money;
	public CreditCard() {
		
	}
	
	public CreditCard(String cardNum, int cardPwd, int secNum, int money) {
		this.cardNum = cardNum;
		this.cardPwd = cardPwd;
		this.secNum = secNum;
		this.money = money;
	}
	
	public String toString() {
		return " 카드번호: " + cardNum + " 비밀번호: " + cardPwd + " 보안코드: " + secNum;
	}

	public String getCardNum() {
		return cardNum;
	}

	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}

	public int getCardPwd() {
		return cardPwd;
	}
	

	public void setCardPwd(int cardPwd) {
		this.cardPwd = cardPwd;
	}

	public int getSecNum() {
		return secNum;
	}

	public void setSecNum(int secNum) {
		this.secNum = secNum;
	}
	
	public int getMoney() {
		return money;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	

}
