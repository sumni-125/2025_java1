package day04;

public class 오윤석_피보나치수열2 {

	public static void main(String[] args) {
		 
		// 1 1 2  3   5    8   13   21
		
		//3개 피보나치 수열
		
		long c ;   //
		long a=1;  //첫번째 항
		long b=1;  //두번재 항 
		
		int i=0;
		
		
		while( i <5) {		 
			c=a+b;   //항을 구한다   
			
			
			a=b;   // 
			b=c;   //
			
			i=i+1;			
			
			System.out.print( a +",");
		}
		
		
		
	}

}
