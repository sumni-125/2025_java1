package day15.정렬;

import java.util.Arrays;

public class Score정렬하기_라이브러리 {

	public static void main(String[] args) {

		Score[] arr  = new Score[5];
		
		
		arr[0]= new Score("박예린", 100,90);
		arr[1]= new Score("이정호", 99,90);
		arr[2]= new Score("김민환", 89,100);
		arr[3]= new Score("김유민", 88,77);
		arr[4]= new Score("박수경", 85,89);
		
		Arrays.sort(arr);
		
		
		
		
		System.out.println(  Arrays.toString(arr));
		
		
		
		for( int i=0; i< arr.length; i++) {			
			System.out.println( arr[i]);//System.out.println( arr[i].toString());
		}
		
	}

}
