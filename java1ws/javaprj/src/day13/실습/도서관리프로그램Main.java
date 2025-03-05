package day13.실습;

import java.util.ArrayList;

public class 도서관리프로그램Main {

	public static void main(String[] args) {
		
		ArrayList<Book> list= new ArrayList<>();
		
		list.add( new Book("스토너","존 윌리엄스",5));
		list.add( new Book("모순","양귀자",2));
		list.add( new Book("소년이 온다","한강",3));
		
		//조회
		for(int i=0; i<list.size();i++) {
			Book item = list.get(i);
			System.out.println(item);
		}
		
		System.out.println("\n*****************");
		
		
		//제목 검색으로 대출
		String borrowtitle = "모순";
		Book borrowBook = null;
		for(int i=0;i<list.size();i++) {
			Book b = list.get(i);
			
			if(b.getTitle().equals(borrowtitle)) {
				borrowBook = b;
				break;
			}
		}
		if(borrowBook != null) {
			borrowBook.number--;
			borrowBook.setNumber(borrowBook.number);
			System.out.println("대출 완료");
		}
		
		System.out.println("\n*****************");
		//조회
		for(int i=0; i<list.size();i++) {
			Book item = list.get(i);
			System.out.println(item);
		}
		
		System.out.println("\n*****************");
		//제목 검색으로 반납
		String returnTitle = "모순";
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
		}
		System.out.println("\n*****************");
		//조회
		for(int i=0; i<list.size();i++) {
			Book item = list.get(i);
			System.out.println(item);
		}
	}

}
