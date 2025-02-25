package day08;

import java.util.Scanner;

public class 일정관리하기_함수2 {
	
	static Scanner sc = new Scanner(System.in);
	static String[][] schedule = new String[7][5];
	static int index=0;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] days = {"월","화","수","목","금","토","일"};
		
		System.out.println("요일을 선택하시오(월~일)");
		String day=sc.next();
		int i=0;
		for(i=0;i<days.length;i++) {
			if(days[i].equals(day)) {
				break;
			}
		}
		
		loop: while(true) {
			System.out.println("메뉴를 선택하시오");
			System.out.println("1.등록, 2.조회, 3.변경, 4.삭제, 5.종료");
		
			int menu=sc.nextInt();
		
			switch(menu) {
			
			case 1:
				등록하기(i);
				break;
			
			case 2:
				조회하기(i);
				break;
			
			case 3:
				변경하기(i);
				break;
				
			case 4:
				삭제하기(i);
				break;
				
			case 5:
				System.out.println("종료합니다.");
				break loop;
			
			default:
				System.out.println("메뉴를 다시 선택하세요");
			
			}
		}
 
	}
	
	public static void 등록하기(int day) {
		System.out.println("등록할 일정 입력하세요");
		String temp = sc.next();
		schedule[day][index]=temp;
		index++;
	}
	
	public static void 조회하기(int day) {
		for(int i=0;i<schedule[day].length;i++) {
			System.out.println(i+1+". "+schedule[day][i]);
		}
	}
	
	public static void 변경하기(int day) {
		조회하기(day);
		System.out.println("변경일정을 선택하시오");
		int updateindex = sc.nextInt()-1;
		
		System.out.println("변경할 일정을 입력하세요");
		String temp = sc.next();
		schedule[day][updateindex]=temp;
	
	}
	
	public static void 삭제하기(int day) {
		조회하기(day);
		
		System.out.println("삭제할 일정을 선택하시오");
		int deleteindex = sc.nextInt()-1;
		
		for(int i=deleteindex;i<schedule[day].length-1;i++) {
			schedule[day][i]= schedule[day][i+1];
					
		}
	}
	
}
