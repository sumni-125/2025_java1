package day04_연산자_제어구조문제;

import java.util.Scanner;

public class ex13 {

	public static void main(String[] args) {
// 13. 연산자와 두 수가 입력되면  사칙연산하는 프로그램을 작성하시오
		
		int su1, su2;
		int result;
		String op;
		
		Scanner sc = new Scanner(System.in);
		
		calc: while(true) {
			System.out.println("수1, 연산자, 수2를 차례로 입력하시오");
			su1=sc.nextInt();
			sc.nextLine();
			op=sc.nextLine();
			su2=sc.nextInt();
			
			switch(op) {
			
			case "+":
				result=su1+su2;
				
				System.out.println("계산결과는: "+result);
				break;
			case "-":
				result=su1-su2;
				System.out.println("계산결과는: "+result);
				break;
			case "*":
				result=su1*su2;
				System.out.println("계산결과는: "+result);
				break;
			case "/":
				result=su1/su2;
				System.out.println("계산결과는: "+result);
				break;
			default:
				System.out.println("연산자를 잘못 입력했습니다.");
				break calc;
			}
			
		}
	}

}
