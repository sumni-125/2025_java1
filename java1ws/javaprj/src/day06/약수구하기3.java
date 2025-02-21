package day06;

import java.util.Arrays;

public class 약수구하기3 {

	public static void main(String[] args) {
		 
		
		//어떤 수에 대한  약수구하기
		//입력된 수에 대한 약수구하기
		// 6  ->  1,2,3,6 
		
		/* 
		  
		  6/ 1  => 나머지가 0이면  1은  약수
		  6/ 2  => 나머지가 0이면  2은  약수
		  6/ 3  => 나머지가 0이면  3은  약수
		  6/ 4  => 나머지가 0이면  4은  약수
		  6/ 5  => 나머지가 0이면  5은  약수
		  6/ 6  => 나머지가 0이면  6은  약수
		  	  
		  
		  
		 */
		
		
		 
		// 배열사용하여 약수를 구하고 한꺼번에 출력하시오 
		
		int su=6;
		int[] 약수  = new int[su];
		int index=0;  // 배열의 index 
		
		
		for( int i=1 ; i<=su; i++) {  // 1~6
			
			if( su % i  ==0) {  //약수 발견 
				//배열에 요소에 넣기 
				//배열의  index 
				약수[index] =i;
				index++;
				
			}			
		}
		
		
		
		for(int i=0; i<약수.length; i++) {
			System.out.print(약수[i]  +" , ");
		}
		
		//
		System.out.println() ;
		
		//약수의 개수만큼 출력하기
		for(int i=0; i<index ;i++) {
			System.out.print(약수[i]  +" , ");
		}
		
		
		//최종적으로 약수의 개수만큼 배열을 만들어서 저장하기 
		
		
		
		//1.약수의 개수만큼 배열 만들기 
		//2.새로운배열에 약수내용 저장하기 
		
		
		int[] 약수최종  = new int[index];
		
		for( int i=0 ; i< index; i++) {
			약수최종[i]  = 약수[i];
		}
		
	
		System.out.println("약수 ==>");
		for( int i=0 ; i<약수최종.length; i++) {
			System.out.print( 약수최종[i]  + ",");
		}
		
		
		
		int[] 약수최종2  =Arrays.copyOf(약수, index);	   //	
		System.out.println( Arrays.toString( 약수최종2));
		 
		
	 
		
		
		

	}

}
