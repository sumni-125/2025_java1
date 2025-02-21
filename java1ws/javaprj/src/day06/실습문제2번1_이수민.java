package day06;

import java.util.Scanner;

public class 실습문제2번1_이수민 {

	public static void main(String[] args) {
		//1)  하루일정을(5개이내) 관리하는 프로그램 작성하기     (일차원배열 사용하기)
		
		Scanner sc = new Scanner(System.in);
		
		String[] todo=new String[5];
		int menu, index=0;
		
		loop: while(true) {
			System.out.println("1.일정조회, 2.일정추가, 3.일정변경, 4.일정삭제, 5.종료 ");
			menu=sc.nextInt();
			switch(menu) {
			case 1:
				if(index==0) {
					System.out.println("오늘은 일정이 없네요. 일정을 추가해보세요!");
					break;
				}
				System.out.println("오늘의 일정을 출력합니다");
				for(int i=0;i<index;i++) {
					System.out.println(i+1+". "+todo[i]);
				}
				break;
				
			case 2:
				if(index==5) {
					System.out.println("일정은 최대 다섯개만 추가할 수 있습니다.");
					break;
				}
				sc.nextLine();
				todo[index]=sc.nextLine();
				index++;
				break;
				
			case 3:
				for(int i=0;i<index;i++) {
					System.out.println(i+1+". "+todo[i]);
				}
				System.out.println("변경하고싶은 일정 번호를 입력하세요");
				int update = sc.nextInt();
				
				update--;
				System.out.println("변경할 일정 내용을 입력하세요");
				sc.nextLine();
				String temp = sc.nextLine();
				todo[update] = temp;
				
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
					todo[i]=todo[i+1];
				}
				break;
				
			case 5:
				break loop;
			}
		}
		
		
		
		
		
		
		
		
		
		
	}

}
