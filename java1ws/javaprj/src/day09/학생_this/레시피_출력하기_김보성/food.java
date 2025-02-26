package day09.학생_this.레시피_출력하기_김보성;

import java.util.Scanner;

public class food {
	
	String menu;
	String choice;
	String quiz;
	
	
	Scanner sc = new Scanner (System.in);
	
	public void 음식정하기() {
		
		System.out.println("어떤 음식을 만드시겠어요? [막걸리수육]");
		this.menu = sc.next();
		
		
	}
	
	public void 음식만들기() {
		
		if( menu.equals("막걸리수육")) {
			System.out.println("1. 물에 대파, 양파,다시마를 넣고 범일콩된장 1 큰 술 풀어 끓여주세요.");
			System.out.println("2. 물이 끓으면 수육용 돼지고기를 넣고 소금 1 큰 술과 막걸리 1병을 넣고 삶아주세요.");
			System.out.println(" quiz : 뚜껑을 [닫고 삶기] or [닫지 않기]");
			this.quiz = sc.next();
				if(quiz.equals("닫지 않기")) {
					System.out.print(" 정답! 	/   ");
					System.out.println(" 처음 20분 정도는 뚜껑을 닫지 않아줘야 막걸리의 시큼한 향이 빠져나갈 수 있어요.");
				}else{
					System.out.print(" 틀렸습니다. 	/   ");
					System.out.println(" 처음 20분 정도는 뚜껑을 닫지 않아줘야 막걸리의 시큼한 향이 빠져나갈 수 있어요.");
				}
			System.out.println("3. 첫 20분간은 뚜껑을 열고 중강불로, 40분간 중불로 끓여 준 후 20분간 뜸 들여주세요");
		}
		System.out.println(this.menu+" 완성~");
	}
	
}
