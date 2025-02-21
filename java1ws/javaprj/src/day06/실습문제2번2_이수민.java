package day06;

import java.util.Scanner;

public class 실습문제2번2_이수민 {

	public static void main(String[] args) {
		//2) 일주일 일정을 관리하는 프로그램 작성하기 (2차원배열 사용하기 )
		
		Scanner sc = new Scanner(System.in);
		
		String[][] todo=new String[7][5];
		String[] days = {"월요일", "화요일","수요일","목요일","금요일","토요일","일요일"};
		int menu, index=0, day;
		
		System.out.print("요일을 숫자로 입력하세요(월요일(1)~일요일(7)) : ");
		
		day=sc.nextInt();
		day--;
			
		loop_todo: while(true) {
			System.out.println("1.일정조회, 2.일정추가, 3.일정변경, 4.일정삭제, 5.종료 ");
			menu=sc.nextInt();
			switch(menu) {
			case 1:
				if(index==0) {
					System.out.println(days[day]+"은 일정이 없네요. 일정을 추가해보세요!");
					break;
				}
				System.out.println(days[day]+"의 일정을 출력합니다");
				for(int i=0;i<index;i++) {
					System.out.println(i+1+". "+todo[day][i]);
				}
				break;
				
			case 2:
				if(index==5) {
					System.out.println("일정은 최대 다섯개만 추가할 수 있습니다.");
					break;
				}
				System.out.println("일정을 입력하세요");
				sc.nextLine();
				todo[day][index]=sc.nextLine();
				index++;
				break;
				
			case 3:
				for(int i=0;i<index;i++) {
					System.out.println(i+1+". "+todo[day][i]);
				}
				System.out.println("변경하고싶은 일정 번호를 입력하세요");
				int update = sc.nextInt();
				
				update--;
				System.out.println("변경할 일정 내용을 입력하세요");
				sc.nextLine();
				String temp = sc.nextLine();
				todo[day][update] = temp;
				
				System.out.println("변경되었습니다");
				
				break;
				
			case 4:
				for(int i=0;i<index;i++) {
					System.out.println(i+1+". "+todo[i]);
				}
				System.out.println("삭제하고싶은 일정 번호를 입력하세요");
				int delete = sc.nextInt();
				delete--;
				index--;
				
				for(int i=delete; i<index;i++) {
					todo[day][i]=todo[day][i+1];
				}
				break;
				
			case 5:
				break loop_todo;
			}
		}
	}

}
