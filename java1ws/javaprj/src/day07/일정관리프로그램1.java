package day07;

import java.util.Scanner;

public class 일정관리프로그램1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String[] 일정 = new String[5];
		int index = 0;
		
		loop: while(true) {
			System.out.println("1.등록 2.조회 3.종료");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1: 
				System.out.println("등록");
				break;
				
			case 2: 
				System.out.println(" 조회");
				break;
				
			case 3: 
				System.out.println("종료");
				break loop;
				
			}
		}
	}

}
