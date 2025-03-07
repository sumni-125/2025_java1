package day15.정렬;

import java.util.Arrays;

public class 정렬하기 {

	public static void main(String[] args) {
		
		
		// 숫자배열
		
		//오름차순정렬  작은것부터 
		int[] arr = new int[] { 10,5,8,11,7};
		
		
		//선택정렬, 버블정렬 
		
		
		//i:기준
		for( int i=0 ; i< arr.length-1 ; i++) {
			
			//j: 비교대상  ( 기준+1~ 끝까지 비교함)
			for( int  j= i+1 ; j< arr.length ; j++) {
				
				if( arr[i] > arr[j] ) {
					
					// i, j 번째 요소 교환  !! (임시변수 필요함 )
					 int temp;
					 temp =arr[i];
					 arr[i] = arr[j];
					 arr[j]= temp;
					 
				}
				
			}
			
		}
		
		
		
		System.out.println( Arrays.toString(arr));
		
		for( int i=0; i< arr.length ; i++) {
			int item  = arr[i];
			System.out.print( item +", ");
		}
		
		System.out.println(  );
		for( int item  :  arr) {
			System.out.print( item +", ");
		}
		
		//  
		int a=10;
		int b=5;
		
		// a,b 교환을 위해서는 임시변수가 필요함 
		int c;
		
		c=a;
		a=b;
		b=c;
		System.out.println("a="+ a + " b="+ b);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//문자열배열
		
		
		
		
		
	}

}
