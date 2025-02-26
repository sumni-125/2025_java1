package day09.짝궁실습;

public class 출력 {

	public static void main(String[] args) {
		
		System.out.println("01. 학생 정보 출력");
		
		students pyr = new students();
		
		pyr.porfile("박예린", "여", 22, "재밌는 것", "바퀴벌레", "소설 읽기, 만화 보기, 게임하기");
		pyr.print();
		
		System.out.println("-----------------------");
		
		students ism = new students();
		
		ism.porfile("이수민", "여", 24, "신나는 것", "벌레", "산책하기");
		ism.print();
		
		System.out.println("=======================");
		System.out.println("02. 인터넷뱅킹");
		
		bank shinhan = new bank();	
		shinhan.banking(15000, 5);
		System.out.print("신한은행 ");
		
		shinhan.printBanking();
		shinhan.입금(5000);
		shinhan.출금(5000);
		shinhan.printAccount();
		shinhan.printBanking();
		
		System.out.println("-----------------------");
		
		bank KB = new bank();
		
		System.out.print("KB국민은행 ");
		KB.banking(30000, 5);
		KB.printBanking();
		
		KB.printAccount();
		KB.printBanking();
	}
}
