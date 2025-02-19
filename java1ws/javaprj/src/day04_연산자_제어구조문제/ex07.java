package day04_연산자_제어구조문제;

import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		// 7. 수를입력받아서 짝수의 합을 구하세요 ( 10개의 수를 입력)
		int cnt=0;
		int su, sum=0;
		
		Scanner sc = new Scanner(System.in);
		
		while(cnt<10) {
			
			cnt++;
			su=sc.nextInt();
			
			if(su%2!=0) {
				continue;
			}
			sum=sum+su;
		}
		
		/*
		while(cnt<10) {
			
			cnt++;
			su=sc.nextInt();
			
			if(su%2==0) {
				sum=sum+su;
			}
			
		}*/
		
		System.out.println("짝수의 총 합은: "+sum);

	}

}
