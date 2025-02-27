package day10.짝꿍실습발표.짝꿍실습_박예린이수민;

public class bank {
	int money; // 잔액
	int plus; // 입금액
	int minus; // 출금액
	int index; // 배열 순서
	String[] account; // 거래 내역을 저장할 배열
	
	// 잔액과 거래 횟수를 지정하는 함수
	public void banking(int money, int cnt){	
		this.money = money;
		this.account = new String[cnt]; // 거래 횟수에 맞게 배열 크기 설정
	}
	
	public void 입금(int plus) {
		this.plus=plus;
		
		// 기존 잔액 출력
		System.out.print("기존 ");
		printBanking();
		
		// 입금
		money+=plus;
		
		// 거래 후 잔액 출력
		System.out.print("거래 후 ");	
		printBanking();
		
		// 위의 내용을 배열에 저장
		account[index]=Integer.toString(plus)+"원 입금";
		index++;
	}
	
	public void 출금(int minus) {
		this.minus=minus;
		
		// 기존 잔액 출력
		System.out.print("기존 ");
		printBanking();
		
		// 출금
		money-=minus;
		
		// 거래 후 잔액 출력
		System.out.print("거래 후 ");
		printBanking();
		
		// 위의 내용을 배열에 저장
		account[index]=Integer.toString(minus)+"원 출금";
		index++;
	}
	
	// 잔액을 출력하는 함수
	public void printBanking()
	{
		System.out.println("잔액: " + money + "원");
	}
	
	// 거래 내역 출력
	public void printAccount() {
		for(int i=0;i<index;i++) {
			System.out.println(account[i]);
		}
	}
}
