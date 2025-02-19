package day04;

public class 정연수_순한맛2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1    2    3        4          5
		// 1  1+2  1+2+3   1+2+3+4     1+2+3+4+5 
		// 1,   3,    6,      10,       15,           21, 28, 36, 45, 55, 220
		
		int f_num=0;  
		int sum=0; //항
		int i=0;  // 순번이면서 반복제어 
		int f_sum=0;  // 항의 누적
		
		
		while( i<10) {			
			f_num = f_num +i;  //			
			sum = f_num +  ( i+1);			
			System.out.print( sum  +", ");
			
			 
			f_sum  = f_sum + sum ;  // f_sum+=sum;
			
			i= i+1;
			
		}
		
		
		System.out.println( f_sum);
		
	 
		

	}

}
