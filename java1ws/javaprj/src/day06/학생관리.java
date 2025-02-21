package day06;

import java.util.Scanner;

public class 학생관리 {

	public static void main(String[] args) {

		//5명 이내의 학생관리  (학생이름관리 하는 프로그램 ) 
		
		
		Scanner sc = new Scanner( System.in);
		String[] names = new String[5];  //배열준비 
		int index=0 ;   //배열의  index (첨자)
		
		
		
		int menu=0;
		
		
	loop:	while(true) {
			
			
			System.out.println("메뉴를 선택하시오 : 1.등록,  2.조회 , 3.변경, 4.삭제 , 5.종료");			
			menu =sc.nextInt();
			
			
			//
			switch( menu) {
			
			case  1:
				System.out.println("1.등록한다"); 
				
				break;
				
			case  2:
				System.out.println("2.조회한다");
								
				
				break;
			case 3:
				System.out.println("3.변경한다");
				
				
				
				break;
			case 4:
				System.out.println("4. 삭제한다");
				
				
				
				break;
			case 5:
				System.out.println("5. 종료");
				break loop;
			}
			
		}
		
		System.out.println("안녕히 가세요 ");
		
		

	}

}
