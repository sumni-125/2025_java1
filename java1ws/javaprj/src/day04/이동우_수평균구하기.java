package day04;

import java.util.Scanner;

public class 이동우_수평균구하기 {

	public static void main(String[] args) {
		 
		
		int n=1; 
		int sum=0;
		int input;
		double avg;
		
		
		//수를 입력받아 1~수까지 합 구하기 
		
		Scanner sc = new Scanner( System.in);
		
		
		input = sc.nextInt();
		
		
		//input 5 => 1~5까지의 합 
		while( n <=input) {    // 1 2 3  4 5
			sum = sum  + n;
			n= n+1;
		}
		
		
		avg = sum  / (double) input;
		
		System.out.println( sum);
		System.out.println( avg);
		
		
		
		
		

	}

}
