package day02;

public class 박예린문제풀이 {

	public static void main(String[] args) {
		 
		
		
		
		//
		
		int y=1999;
		double h =2500000;
		double k  =1800000;
		
		//final int MAX=100;
		
		while(  k<=h) {
			y++;
			h= h*1.036;
			k= k*1.042;		
			
		}
		
		
		System.out.println(y);
	 
	}

}
