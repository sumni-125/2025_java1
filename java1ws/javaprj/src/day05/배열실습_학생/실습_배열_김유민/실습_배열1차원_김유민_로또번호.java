package day05.배열실습_학생.실습_배열_김유민;

public class 실습_배열1차원_김유민_로또번호 {

	public static void main(String[] args) {
		
		String[] lotto = new String[6];
		
		lotto[0] = "2";
		lotto[1] = "8";
		lotto[2] = "15";
		lotto[3] = "31";
		lotto[4] = "38";
		lotto[5] = "41";
		
		
		
		System.out.println("★반복문으로 출력★");
		for( int i=0 ; i< lotto.length; i++) {
			
			System.out.println(lotto[i]);
		}
		
		
		
		
		System.out.println();
		System.out.println("★배열상 위치로 출력★");
		
		System.out.println(lotto[0]);
		System.out.println(lotto[1]);
		System.out.println(lotto[2]);
		System.out.println(lotto[3]);
		System.out.println(lotto[4]);
		System.out.println(lotto[5]);

	}

}
