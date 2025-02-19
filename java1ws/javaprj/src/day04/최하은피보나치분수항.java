package day04;

public class 최하은피보나치분수항 {

	public static void main(String[] args) {


		int  plus=1;   // 홀수항 분자   (+기호 항의 분자) 
		int minus=2;    //짝수항 분자   (-기호 항의 분자)
		
		int plusF;    // +항의 분모
		int minusF;   // -항의 분모
		
		
		
		double plus항;
		double minus항;
		
		double plusadd  =1;   // 홀수항 합계  ( +기호 항의 합계 )
		double minusadd= 1;   // 짝수항 합계   (-기호 항의 합계)
		
		double sum ;
		
		while( minus<10) {
			
			plus = plus+2;     //3  // 분자
			minus  = minus+2;  //4  // 분자
			
			
			// +분모
		
			
			plusF=1;
			for( int i=1; i<=plus; i++) {   //분자  3   분모  : 3!   =>1*2*3
				
				plusF  = plusF *i;     //
			}
			
			
			// -분모
			
			minusF=1;
			for( int i=1; i<= minus ; i++) {   //분자 4  분모 4!  => 1*2*3*4
				minusF  = minusF* i;
			}
			
			
			//덧셈항 구하기
			plus항  =  plus/(double)plusF; 
			
			//덧셈항 누적
			plusadd = plusadd +  plus항 ;
			
			
			//뺄셈항 구하기
			minus항  =  minus/(double) minusF;
			
			//뺄셈항 누적
			
			minusadd = minusadd  +  minus항 ;
			
			
			System.out.print(plus항  +"," );
			System.out.print(minus항 +",");
			
		}
		
		
		//
		sum=plusadd- minusadd;
		
		System.out.println( sum);
		
		

	}

}
