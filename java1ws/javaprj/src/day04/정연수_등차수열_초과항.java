package day04;

public class 정연수_등차수열_초과항 {

	public static void main(String[] args) {
	 
		
		  // 1  3   5   7     => n
		 //  1                =>  sum
		
		
		int sum =1;  //누적항
		int n=1;  //항
		
		
		// 1000 => 20을 초과하면 종료 
		while( sum  <1000) { 
			
			n= n+2;     //3
			sum  = sum + n; 
			
			
			System.out.print( n );
			System.out.println( "누적 "+  sum);
			
		}
		
		System.out.println( sum);
		System.out.println( n);
		
		
	}

}
