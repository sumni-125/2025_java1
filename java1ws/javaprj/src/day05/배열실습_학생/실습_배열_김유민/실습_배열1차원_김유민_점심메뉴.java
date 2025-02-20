package day05.배열실습_학생.실습_배열_김유민;

public class 실습_배열1차원_김유민_점심메뉴 {

	public static void main(String[] args) {
		
		
		String[] lunch = new String[7];
		
		lunch[0] = "햄버거";
		lunch[1] = "치킨";
		lunch[2] = "피자";
		lunch[3] = "돈까스";
		lunch[4] = "돼지국밥";
		lunch[5] = "떡볶이";
		lunch[6] = "샌드위치";
		
		
		System.out.println("★반복문으로 출력★");
		for( int i=0 ; i< lunch.length; i++) {
			
			System.out.println(lunch[i]);
		}
		
		
		
		
		System.out.println();
		System.out.println("★배열상 위치로 출력★");
		
		System.out.println(lunch[0]);
		System.out.println(lunch[1]);
		System.out.println(lunch[2]);
		System.out.println(lunch[3]);
		System.out.println(lunch[4]);
		System.out.println(lunch[5]);
		System.out.println(lunch[6]);
		

	}

}
