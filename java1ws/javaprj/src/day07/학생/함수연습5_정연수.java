package day07;

import java.util.Random;

public class 함수연습5_정연수 {

	public static void main(String[] args) {
		int[] lotto = lotto();
		
		for(int i=0; i<lotto.length; i++) {
			System.out.println(lotto[i]);
		}
		

	}
	
	public static int[] lotto() {
		int[] lotto = new int[6];
		Random random = new Random();
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = random.nextInt(45);
		}
		return lotto;
	}

}
