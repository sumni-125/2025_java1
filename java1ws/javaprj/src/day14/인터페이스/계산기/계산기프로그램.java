package day14.인터페이스.계산기;

import java.util.Scanner;

public class 계산기프로그램 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 수를 입력하세요");
		int su1 = sc.nextInt();
		int su2 = sc.nextInt();
		
		System.out.println("연산자를 입력하세요");
		
		String temp = sc.next();
		char op = temp.charAt(0);//0번째 문자만
		
		
		//SMCalculator cal = new SMCalculator();
		LGCalculator cal = new LGCalculator();

		
		switch(op) {
		case '+':
			//int result = cal.addSM(su1, su2);

			int result = cal.addLG(su1, su2);
			System.out.println(result);
			break;
			
		case '-':
			//int result2 = cal.subSM(su1, su2);
			int result2 = cal.subLG(su1, su2);
			System.out.println(result2);
			break;
			
		default:
			System.out.println("잘못된메뉴");
			break;
		}
	}

}
