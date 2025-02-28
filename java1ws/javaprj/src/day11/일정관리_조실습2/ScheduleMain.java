package day11.일정관리_조실습2;

import java.util.Scanner;

public class ScheduleMain {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름과 날짜를 입력하세요");
		String name = sc.next();
		Schedule s = new Schedule(name);
		
		
		loop: while(true) {
			
			System.out.println("1.일정조회, 2.일정추가, 3.일정변경, 4.일정삭제, 5.종료 ");
			int menu=sc.nextInt();
			switch(menu) {
			
			case 1:
				
				s.printAllSchedule();
				
				break;
				
			case 2:
				System.out.println("카테고리를 입력하세요");
				String category = sc.next();
				System.out.println("일정을 입력하세요");
				sc.nextLine();
				String schedule = sc.nextLine();
				s.addSchedule(category, schedule);
				
				break;
				
			
				
			case 5:
				break loop;
			}
			
			
		}
		
	}

}
