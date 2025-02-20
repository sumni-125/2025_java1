package day05;

import java.util.Scanner;

public class 짝수배열문제2 {

	public static void main(String[] args) {
		 
		//  배열은 10개로 준비한다 
		///2)숫자를 입력 받아서 0이  아니면 배열에 저장한 후   =>   입력된 갯수만큼 출력하기  
	 
		
		/*
		  
		  입력 : 수 : input   , 숫자배열 nums(10)
		  출력 : 숫자배열에서 입력된 수만큼 출력하기 
		  처리 : 배열의 인덱스 :index 		  
		 */
		
		
		/*
		   1.반복 (0이 아닐동안)
		      -숫자 입력 
		      -배열요소에 저장
		      -배열 인덱스 증가
		   2. 입력된 개수만큼  출력		 
		 
		 */
		
		Scanner sc = new Scanner( System.in);
		 
		int[] nums  = new int[10];
		int input;
		int index=0;
		input  = sc.nextInt();
		
		
		while( input !=0) {
			
			nums[index]= input;
			index++;
			
			input = sc.nextInt();			
		}
		
		
		//
		for( int i=0; i<nums.length; i++) {			
			System.out.println( nums[i]);
		}
		
	 
		for( int i=0; i<index; i++) {			  //1
			System.out.println( nums[i]);
		}
		
		

	}

}
