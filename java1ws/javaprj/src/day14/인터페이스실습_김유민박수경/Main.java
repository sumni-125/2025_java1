package day14.인터페이스실습_김유민박수경;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {		//인스턴스 변수 정의
	
	OrderInfo info;
	String pizzaStore;
	String pizza;
	
	String topping1;
	String topping2;
	String result1;
	
	String side1;
	String side2;
	String result2;

	
	public static void main(String[] args) {
		
		
		
		ArrayList<Object> list = new ArrayList<>();	//ArrayList 사용
		//오븐피자
		list.add(new 뉴욕스타일피자());
		list.add(new 시카고딥디시());
		list.add(new 프렌치화이트피자());
		//화덕피자
		list.add(new 디아볼라());
		list.add(new 마르게리타());
		list.add(new 퀴트로());
		
		ArrayList<화덕에굽는피자>  화덕피자 = new ArrayList<>();
		ArrayList<오븐에굽는피자>  오븐피자 = new ArrayList<>();
		
		
			for( int  i =0 ;  i<  list.size()  ;i ++) {
			
			Object o   = list.get(i);
			
				if(  o instanceof 오븐에굽는피자 ) { //instanceof로 o가 오븐에굽는피자의 인스턴스인지 확인
					오븐피자.add( (오븐에굽는피자)  o);				
				}
				
				
				
				if(  o instanceof 화덕에굽는피자 ) {
					화덕피자.add( (화덕에굽는피자)  o);				
				}
			}	
			
		System.out.println( "오븐피자: ");
		for( int i=0 ; i< 오븐피자.size() ;i++ ) {
			오븐피자.get(i).오픈에굽기();
		}
		
		System.out.println("=================");
		
		System.out.println( "화덕피자: ");
		for( int i=0 ; i< 화덕피자.size() ;i++ ) {
			화덕피자.get(i).화덕에굽기();;
		}
		
		System.out.println("=================");
		
		//아래 코드 실행
		Main m = new Main();
		m.order();
		
		
	}
	
	public void OrderInfo(OrderInfo info) {
        this.info = info;
    }
	
	public void order() {
		
		System.out.println("오늘 저녁은 피자입니다. 어느 피자가게에 갈까요??");
		System.out.println("피자헛 VS 도미노");
		
	loop:	while(true) {
			System.out.println("1.피자가게를 정하기, 2.피자메뉴를 입력하기, 3.토핑추가하기, 4.사이드추가하기 5.주문정보출력하기");
			Scanner sc = new Scanner(System.in);
			int menu = sc.nextInt();
			switch(menu) {
				
			case 1:
				System.out.println("피자 가게를 입력하시오");
                pizzaStore = sc.next();  

                if (pizzaStore.equals("피자헛")) {
                	OrderInfo(new 피자헛());
                    System.out.println("****피자헛에 오신것을 환영합니다****");
                    
                } else if (pizzaStore.equals("도미노")) {
                	OrderInfo(new 도미노());
                    System.out.println("****도미노에 오신것을 환영합니다****");
                    
                } else {
                    System.out.println("잘못된 브랜드입니다.");
                }
                break;
                
			case 2:
				System.out.println("피자메뉴를 정해주세요");
				pizza = sc.next();
				System.out.println(pizza+"를 주문하셨군요. 토핑을 추가해주세요");
				break;
                
			case 3:
				System.out.println("토핑을 2개 고르세요");
				topping1 = sc.next();
				topping2 = sc.next();
				
				result1 = info.topping(topping1, topping2);
				System.out.println(topping1+"와 "+topping2+"를 추가했습니다");
				System.out.println("===================");
				break;
				
			case 4:
				System.out.println("사이드를 2개 추가해주세요");
				side1 = sc.next();
				side2 = sc.next();
				
				result2 = info.side(side1, side2);
				System.out.println(side1+"와 "+side2+"를 추가했습니다");
				System.out.println("===================");
				break;
				
			case 5:
				System.out.println("피자가게: "+pizzaStore);
				System.out.println("주문한 피자: "+ pizza);
				System.out.println("토핑: " +topping1+"와 " +topping2);
				System.out.println("사이드메뉴: "+side1+"와 " +side2);
				System.out.println("주문하신메뉴 나왔습니다~~");
				break loop;
				
				
			default:
				System.out.println("잘못된 메뉴 입력");
				
			}
		}
	}
	
	
	

}
