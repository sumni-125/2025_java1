package day09.짝궁실습;

public class bank {
	int money;
	int plus;
	int minus;
	int index;
	String[] account;
	
	
	public void banking(int money, int cnt ){	
		this.money = money;
		this.account = new String[cnt];
	}
	
	public void 입금(int plus) {
		this.plus=plus;
		System.out.print("기존 ");
		printBanking();
		money+=plus;
		System.out.print("거래 후 ");	
		printBanking();
		account[index]=Integer.toString(plus)+"원 입금";
		index++;
	}
	public void 출금(int minus) {
		this.minus=minus;
		System.out.print("기존 ");
		printBanking();
		money-=minus;
		System.out.print("거래 후 ");
		printBanking();
		account[index]=Integer.toString(minus)+"원 출금";
		index++;
	}
	
	public void printBanking()
	{
		System.out.println("잔액: " + money + "원");
		
		
		
	}
	
	public void printAccount() {
		for(int i=0;i<index;i++) {
			System.out.println(account[i]);
		}
	}
}
