package day04;

public class 황예지인구수년도구하기 {

	public static void main(String[] args) {
		 
		
		double H=250;
		double K=180;
		int year=1999;
		
		
		while( K<= H) {
			
			year  = year+1;
			H= H*1.036;
			K= K*1.042;
		}
				
		
		System.out.println( year); 

	}

}
