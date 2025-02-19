package day04_연산자_제어구조문제;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int code;
		Scanner sc = new Scanner(System.in);
		int i=0;
		
		loop: while(i<5) {
			System.out.println("1.등록, 2.조회, 3.변경, 4.삭제");
			code=sc.nextInt();
			
			switch(code) {
			
			case 1:
				System.out.println("등록");
				i++;
				break;
			case 2:
				System.out.println("조회");
				i++;
				break;
			
			case 3:
				System.out.println("변경");
				i++;
				break;
			
			case 4:
				System.out.println("삭제");
				i++;
				break;
			default:
				System.out.println("번호를 다시 입력하세요");
				i++;
				break;
			
			}
		}
		

	}

}
