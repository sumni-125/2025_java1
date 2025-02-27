package day10.짝꿍실습발표.짝꿍실습_박예린이수민;

public class 출력 {

	public static void main(String[] args) {
		/*
		System.out.println("01. 학생 정보 출력");
		
		students pyr = new students();
		
		pyr.porfile("박예린", "여", 22, "재밌는 것", "바퀴벌레", "소설 읽기, 만화 보기, 게임하기");
		pyr.print();
		
		System.out.println("-----------------------");
		
		students ism = new students();
		
		ism.porfile("이수민", "여", 24, "신나는 것", "벌레", "산책하기");
		ism.print();*/
		
		bank shinhan = new bank();
		System.out.print("신한은행 ");
		shinhan.banking(15000, 5); // 잔액 15000원, 거래 횟수 5회
		shinhan.printBanking();
		shinhan.입금(5000); // 5000원 입금
		shinhan.출금(5000); // 5000원 입금
		shinhan.printAccount();
		shinhan.printBanking();
		
		System.out.println("-----------------------");
		
		bank KB = new bank();
		System.out.print("KB국민은행 ");
		KB.banking(30000, 5); // 잔액 30000원, 거래 횟수 5회
		KB.printBanking();
		KB.printAccount();
		KB.printBanking();
	}
}
