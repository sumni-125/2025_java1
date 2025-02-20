package day05.배열실습_학생.배열실습_임형택;

public class 배열문제2번 {
	public static void main(String[] args) {
		
		int [] lotto = new int[6];
		
		lotto[0] = 21;
		lotto[1] = 23;
		lotto[2] = 27;
		lotto[3] = 35;
		lotto[4] = 39;
		lotto[5] = 44;
		
		System.out.println("로또 번호");
		for(int i=0; i<lotto.length; i++) {
			System.out.println(lotto[i]);
		}
		
		
		
	}
}
