package day13.실습;

import java.util.ArrayList;
import java.util.Scanner;

public class 도서관Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Book> list= new ArrayList<>();
		
		list.add( new Book("스토너","존 윌리엄스",5));
		list.add( new Book("모순","양귀자",2));
		list.add( new Book("소년이 온다","한강",3));
		
		loop :while(true) {
			System.out.println("\n*****************\n");
			System.out.println("메뉴를 선택하세요");
			System.out.println("1.도서조회		2.도서대출		3.도서반납		4.종료");
			int main = sc.nextInt();
			
			switch(main) {
			case 1:
				조회하기(list);
				
				break;
			
			case 2:
				
				조회하기(list);
				
				대출하기(sc, list);
				
				break;
			
			case 3:
				
				반납하기(sc, list);
				
				
				break;
			
			case 4:
				break loop;
			
			default:
				System.out.println("번호를 다시 선택하세요");
				break;
			
			}
			
		}
	
	}

	public static void 반납하기(Scanner sc, ArrayList<Book> list) {
		System.out.println("\n*****************");
		System.out.println("\n반납할 도서의 제목을 입력하세요.");
		sc.nextLine();
		
		String returnTitle = sc.nextLine();
		Book returnBook = null;
		for(int i=0;i<list.size();i++) {
			Book b = list.get(i);
					
			if(b.getTitle().equals(returnTitle)) {
				returnBook = b;
				break;
			}
		}
		if(returnBook != null) {
			returnBook.number++;
			returnBook.setNumber(returnBook.number);
			System.out.println("반납 완료");
		}else {
			System.out.println("반납 실패");
		}
	}

	
	
	public static void 대출하기(Scanner sc, ArrayList<Book> list) {
		System.out.println("\n*****************\n");
		System.out.println("대출할 책 제목을 입력하세요");
		
		sc.nextLine();
		
		String borrowtitle = sc.nextLine();
		Book borrowBook = null;
		
		for(int i=0;i<list.size();i++) {
			Book b = list.get(i);
			
			if(b.getTitle().equals(borrowtitle)) {
				borrowBook = b;
				break;
			}
		}
		if(borrowBook != null && borrowBook.number>0) {
			borrowBook.number--;
			borrowBook.setNumber(borrowBook.number);
			System.out.println("대출 완료");
		}else {
			System.out.println("대출 실패");
		}
	}

	public static void 조회하기(ArrayList<Book> list) {
		System.out.println("\n*****************\n");
		System.out.println("대출 가능 도서를 조회합니다.");
		
		for(int i=0; i<list.size();i++) {
			Book item = list.get(i);
			if(item.number!=0) {
				System.out.println(item);
			}
			
		}
	}

}
