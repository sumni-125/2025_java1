package day10.실습문제;

public class BookInfo출력 {

	public static void main(String[] args) {
		
		BookInfo b = new BookInfo("초역 부처의 말", "코이케 류노스케", 16020);
		BookInfo b2 = new BookInfo("해커스 토익 기출 VOCA(보카)", "David Cho", 11610);
		BookInfo b3 = new BookInfo("소년이 온다", "한강", 13500);
		
		System.out.println(b.toString());
		System.out.println(b2.toString());
		System.out.println(b3.toString());
		
		BookInfo[] bookList = new BookInfo[3];
		
		bookList[0]=new BookInfo("초역 부처의 말", "코이케 류노스케", 16020);
		bookList[1] =  new BookInfo("해커스 토익 기출 VOCA(보카)", "David Cho", 11610);
		bookList[2] = new BookInfo("소년이 온다", "한강", 13500);
		
		for(int i=0;i<bookList.length;i++) {
			System.out.println(bookList[i].toString());
		}
		
	}

}
