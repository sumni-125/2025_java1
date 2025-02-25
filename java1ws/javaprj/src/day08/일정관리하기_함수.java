package day08;

import java.util.Scanner;

public class 일정관리하기_함수 {
	
	static Scanner sc = new Scanner(System.in);
	static String[] schedule = new String[5];
	static int index=0;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("메뉴를 선택하시오");
		int menu=sc.nextInt();
		if(menu==1) {
			등록하기();
		}else if(menu==2) {
			
		}else if(menu==3) {
			
		}
	
	}
	
	public static void 등록하기() {
		System.out.println("등록할 일정 입력하세요");
		String temp = sc.next();
		schedule[index]=temp;
		index++;
	}
	
	public static void 조회하기() {
		for(int i=0;i<schedule.length;i++) {
			System.out.println(i+1+". "+schedule[i]);
		}
	}
	
	public static void 변경하기() {
		조회하기();
		System.out.println("변경일정을 선택하시오");
		int updateindex = sc.nextInt()-1;
		
		System.out.println("변경할 일정을 입력하세요");
		String temp = sc.next();
		schedule[updateindex]=temp;
	
	}
	
	public static void 삭제하기() {
		조회하기();
		
		System.out.println("삭제할 일정을 선택하시오");
		int deleteindex = sc.nextInt()-1;
		
		for(int i=deleteindex;i<schedule.length-1;i++) {
			schedule[i]= schedule[i+1];
					
		}
	}
	
}
