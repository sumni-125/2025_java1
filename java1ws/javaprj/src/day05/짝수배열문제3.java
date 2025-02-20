package day05;

import java.util.Scanner;

public class 짝수배열문제3 {

	public static void main(String[] args) {
		 
		
		 /*
		   
		    입력: 입력되는 수  : input  , 숫자배열 nums(10) 
		    출력: 숫자배열에 저장된 개수만큼 출력하기 
		    처리: 배열의 인덱스  : index 
		    
		    
		    처리과정
		    1. 반복 (0이 아닐동안  )
		       1.1 수를 입력 
		       1.2 수를 판단
		           - 짝수이면
		              - 배열의 요소에 넣기 
		              - 배열의 인덱스 증가 	           
		    
		    2. 배열의 입력된 짝수만큼 출력하기
		  */
		
		 
		int input;
		int[] nums = new int[10];
		int index=0;
		Scanner sc = new Scanner( System.in);
		
		
		while(true) {
			
			input = sc.nextInt();
			
			if( input ==0) break ;
			
			//
			if( input %2==0) {
				nums[index] = input;
				index++;
			}			
			
		}
		
		//
		
		for( int i=0 ; i< index; i++ ) {
			 System.out.println( nums[i]);
		}
		
		
		for( int i=0 ; i< nums.length; i++ ) {
			 System.out.println( nums[i]);
		}
		

	}

}
