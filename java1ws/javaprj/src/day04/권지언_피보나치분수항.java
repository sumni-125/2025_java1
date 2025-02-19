package day04;

public class 권지언_피보나치분수항 {

	public static void main(String[] args) {
		 
		
		double sum=0;
		int sign=1;
		
		for( int i=1; i<=10 ; i++) {
			
			int multi =1;
			
			for(int j=1; j<=i; j++) {    //   i=> 3  j=> 1~3
				multi= multi *j;         //   1*2*3
			}
			
			
			sum  +=  sign  *  (  i /(double) multi);
			sign*=-1;   // sign  = sign*-1 ;   sign  = -sign ;
			
		}
		
		
		System.out.println( sum);
		System.out.printf( "%.2f",sum);

	}

}
