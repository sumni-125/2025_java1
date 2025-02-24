package day07.학생;

import java.util.Scanner;

public class 실습1_김유민_종료시출력 {

	public static void main(String[] args) {
		
		
		
		int money []= {50000,10000,5000,1000,500,100,50,10};
		Scanner sc = new Scanner( System.in);
		String[] names = new String[10];	
		int menu;
		int index[]= new int [10];
		
		
		
	loop:	while(true) {
			
			
			System.out.println("1. 출장비 출력하기 , 2. 종료하기");
			menu = sc.nextInt();
			
			
			//
			switch(menu){
				
				//사원당 출장비 화폐 출력
				case 1:
					sc.nextLine();
					System.out.println("사원명을 입력하시오:");
					String employeeName = sc.nextLine();
					
					
					System.out.println("출장비를 입력하시오:");
					int expense =  sc.nextInt();
					
					
					System.out.println(employeeName + "님의 화폐매수는: ");
			        for (int i=0;i<money.length;i++) {
			            int count = expense / money[i];
			            expense %= money[i];
			            System.out.println(money[i] + "원: " + count);
			            index[i]+=count;
			            
			        }
			        
					
					break;
					
				//종료시 화폐당 총합	출력
				case 2:
					System.out.println("종료하시겠습니까(stop 입력 시 종료)");
					String input = sc.next();
					if(input.equals("stop")) {
						break loop;
					}
					break;
					
			}
		}
	
		for( int i=0;i<money.length;i++) {
			System.out.println(money[i]+"원"+index[i]);
		}
		

	}

}
