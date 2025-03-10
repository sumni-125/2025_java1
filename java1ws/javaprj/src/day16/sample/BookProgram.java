package day16.sample;
import java.util.Date;
 
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;


/*
 * 
 * 1. 대여를 위한 책정보 생성
 * 2. 반복 (메뉴가 종료가 아닐 동안)
 *     - 메뉴선택
 *     - 대여
 *        - 대여번호, 도서번호입력
 *        - 도서가 대여가능상태인지 판단
 *          - 도서 대여가능
 *             :도서상태 대여중으로 변경
 *             :반납일자, 대여일자생성
 *             :대여리스트에 추가 
 *          - 도서 대여 불가능
 *            : 도서불가능 메시지       
 *     - 반납
 *        -대여번호 입력
 *        -반납상태변경
 *        -도서의 상태를 대여가능으로 변경
 *     - 조회
 *       - 대여리스트 전체 조회 * 
 * 
 */
public class BookProgram {
	  

	public static void main(String[] args) { 	 
		
		//책정보 생성		
		ArrayList<Book>  books = new ArrayList<>(); 		
		Scanner sc = new Scanner(System.in);
		
		books.add( new Book("b001" ,"재미있는 책" , "김솔"));
		books.add( new Book("b002" ,"신나는  책" , "김채운"));
		books.add( new Book("b003" ,"싸우는 책" , "주형준"));
		books.add( new Book("b004" ,"재미있는 책" , "이효진"));
		books.add( new Book("b005" ,"무서운 책" , "송수빈"));
		books.add( new Book("b006" ,"웃긴 책" , "김세현"));
	 			
		// 대여시작  (메뉴제공) 		
		ArrayList<Lend> lendList = new ArrayList<>();
		
		loop1 :while( true) {
			
			System.out.println("1.대여  2. 조회   3.반납   4. 종료");
			int menu = sc.nextInt();			
			switch( menu) {			
			case 1:
				System.out.println();
				System.out.println("대여코드입력");
				String lendId= sc.next(); 			
				
				System.out.print("도서코드입력");
				String bookId = sc.next();
				
			 
				boolean flag=false;
				// 책 대여가능여부 , 책상태 비교
				Book book=null;
				for(int i=0 ; i< books.size(); i++) {
					 book = books.get(i);
					if(book.getBookId().equals(bookId) && book.getState() ==1  ) {		
						book.setState(0);  // 대여중					 
						flag=true; 
						break;  // 도서발견하면 반복문 나옴
					}					
				}				
				
				if(flag) {					
					//대여일, 반납일 구하기
					Calendar cal = Calendar.getInstance();				 	 
					Date lendDate =  cal.getTime() ;
					// 14일후 2주 후 , 일 기준
					cal.add(Calendar.DATE ,14);		 
					Date returnDate = cal.getTime() ;					
					
					Lend lend = new Lend(  lendId, lendDate, returnDate,  book );
					lendList.add(lend);
					System.out.println( lend);
					System.out.println( "대여되었습니다");
					
				}else {
					System.out.println("대여불가능" );
				}			
			        
				break;
			case 2:
				
				for(int i=0; i< lendList.size() ; i++) {
					System.out.println( lendList.get(i));
				}				
				break;
			case 3:
				System.out.println("반납할 대여번호를 입력하세요");
				String idLend = sc.next();
				//정상인경우
				
				//대여정보  출력하기
				for( int i=0 ; i< lendList.size() ; i++) {
					Lend lend = lendList.get(i);
					if(  lend.lendId.equals( idLend)) {
						lend.setReturnFlag(true);
						lend.book.setState(1);
						System.out.println("반납되었습니다");
						System.out.println("반납정보" +  lend);
						break;
					}
				}
				
				
				break;
			case 4:
				System.out.println(" 종료");
				break loop1;
			default:
				
			}
			
		} 
		
	}

	 

}

 

