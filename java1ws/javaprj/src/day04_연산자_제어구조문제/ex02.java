package day04_연산자_제어구조문제;

public class ex02 {

	public static void main(String[] args) {
		// 1~10까지 합 구하기  (for, while문 사용하기)
		int sum1=0;
		for(int i=1;i<=10;i++) {
			sum1+=i;
		}

		int sum2=0;
		int j=0;
		
		while(j<10) {
			j++;
			sum2+=j;
		}
		
		System.out.println("sum1: "+sum1);
		System.out.println("sum2: "+sum2);
	}

}
