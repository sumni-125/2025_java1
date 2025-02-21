package day06;

public class 약수구하기1 {

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
		
		
		// 배열쓰지 않고 약수 출력하시오 
		// 배열사용하여 약수를 구하고 한꺼번에 출력하시오 
		
		
		/*
		int su =6;
		
		for( int i=1; i<=su; i++ ) {
			
			if( su % i ==0) {
				System.out.println( i);
			}
		}
		
		*/
		/*
		int su=6; 		
		
		if( su % 1 ==0) {
			System.out.println(  "1은 약수");
		}
		
		if( su % 2 ==0) {
			System.out.println(  "2은 약수");
		}
	
		if( su % 3 ==0) {
			System.out.println(  "3은 약수");
		}
		if( su %4 ==0) {
			System.out.println(  "4은 약수");
		}
		if( su % 5 ==0) {
			System.out.println(  "5은 약수");
		}
		if( su % 6 ==0) {
			System.out.println(  "6은 약수");
		}
		
		*
		*/
		
		int su=6;
		for( int i=1; i<=6; i++) {
			if( su % i ==0) {
				System.out.println(  i+"은 약수");
			}
		}
		

	}

}
