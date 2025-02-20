package day05.배열실습_학생.배열실습_이정호;

import java.util.Arrays;

public class 배열실습 {

	public static void main(String[] args) {
		int[] lotto = new int[6]; 
		
		for(int i = 0 ; i < 6; i++) {
			lotto[i] = (int)(Math.random() * 45 + 1); //랜덤 숫자 생성해서 배열에 저장
			
			//중복 방지
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
				}
			}
		}
		
		Arrays.sort(lotto); //로또 값 오름차순으로 정렬
		
		for(int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " "); //로또 출력
		}
	}

}
