package day05.배열실습_학생.실습_배열_김유민;

public class 실습_배열1차원_김유민_좋아하는음식 {

	public static void main(String[] args) {
		
		String[] food = new String[5];
		
		food[0] = "햄버거";
		food[1] = "치킨";
		food[2] = "피자";
		food[3] = "파스타";
		food[4] = "돼지국밥";
		
		
		
		System.out.println("★반복문으로 출력★");
		for( int i=0 ; i< food.length; i++) {
			
			System.out.println(food[i]);
		}
		
		
		
		
		System.out.println();
		System.out.println("★배열상 위치로 출력★");
		
		System.out.println("1번째로 좋아하는 음식: "+food[0]);
		System.out.println("2번째로 좋아하는 음식: "+food[1]);
		System.out.println("3번째로 좋아하는 음식: "+food[2]);
		System.out.println("4번째로 좋아하는 음식: "+food[3]);
		System.out.println("5번째로 좋아하는 음식: "+food[4]);
		
	}

}
