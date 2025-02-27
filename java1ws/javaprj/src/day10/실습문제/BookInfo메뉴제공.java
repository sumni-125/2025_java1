package day10.실습문제;

import java.util.Scanner;

public class BookInfo메뉴제공 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BookInfo2[] list = new BookInfo2[3];
		int index=0;
		
		loop: while(true) {
			System.out.println("1.장바구니등록 2.장바구니조회 3.수량변경 4.총금액계산 5.종료");
			System.out.print("메뉴를 선택하세요: ");
			int menu = sc.nextInt();
			
			
			switch(menu) {
			
			case 1:
				sc.nextLine();
				System.out.println("등록할 책 정보를 입력하세요(제목, 저자, 가격, 수량)");
				
				String title = sc.nextLine();
				String author=sc.next();
				int price = sc.nextInt();
				int quantity = sc.nextInt();
				
				list[index]= new BookInfo2(title, author, price, quantity);
				
				index++;
				
				System.out.println("등록성공!");
				
				break;
				
			case 2:
				
				System.out.println("조회합니다.");
				
				for(int i=0;i<index;i++) {
					System.out.println((i+1)+". "+list[i].toString());
				}
				
				break;
				
			case 3:
				
				for(int i=0;i<index;i++) {
					System.out.println(list[i].toString());
				}
				
				System.out.print("변경할 책 번호를 입력하세요: ");
				int updateIndex=sc.nextInt();
				updateIndex--;
				
				System.out.print("변경된 수량을 입력하세요: ");
				int updateQuantity = sc.nextInt();
				
				list[updateIndex].setQuantity(updateQuantity);
				
				System.out.println("변경성공!");
				break;
				
			case 4:
				
				for(int i=0;i<index;i++) {
					list[i].calcTotal();
				}
				System.out.println("계산완료!");
				
				break;
				
			case 5:
				break loop;
			default:
				System.out.println("메뉴를 다시 선택하세요");
				break;
			
			
			}
		}
		
	}

}
