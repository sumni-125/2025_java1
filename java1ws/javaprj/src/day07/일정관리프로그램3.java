package day07;

import java.util.Scanner;

public class 일정관리프로그램3 {

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
				index = 등록하기(일정, index, sc);
				break;
				
			case 2: 
				System.out.println(" 조회");
				
				for(int i = 0; i<index; i++) {
					System.out.println(일정[i]);
				}
				
				break;
				
			case 3: 
				System.out.println("종료");
				break loop;
				
			}
		}
	}
	public static int 등록하기(String[] 일정, int index, Scanner sc) {
		System.out.println("등록");
		System.out.println("등록할 일정 입력하세요");
		
		String title = sc.next();
		일정[index]=title;
		index++;
		
		return index;
		
	}

}
