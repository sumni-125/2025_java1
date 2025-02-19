package day04_연산자_제어구조문제;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		// 3. 사용자로부터 수를 입력받아 입력받은 수까지의 합 구하기
		
		Scanner sc = new Scanner(System.in);
		int num, sum;
		sum=0;
		System.out.println("0을 입력하면 종료됩니다");
		while(true) {
			num=sc.nextInt();
			
			if(num==0) {
				break;
			}
			sum+=num;
		}
		System.out.println("총 합은: "+sum);
		
		
	}

}
