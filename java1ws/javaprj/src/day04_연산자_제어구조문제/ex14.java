package day04_연산자_제어구조문제;

public class ex14 {

	public static void main(String[] args) {
		// 14 . 구구단을 단보다 곱하는 수가 작거나 같은경우까지만 출력하는 프로그램을 작성하시오 
		
		for(int i=1; i<10;i++) {
			System.out.println(i+"단");
			for(int j=1; j<=i;j++) {
				System.out.println(i+" * "+j+" = "+i*j);
			}
			System.out.println();
		}
		
		
	}

}
