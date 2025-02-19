package day04;

import java.util.Scanner;

public class 김보성임금구하기 {

	public static void main(String[] args) {
		 
		
		String name="";
		int code =0;
		int time =0;
		
		int wages=0;
		
		
		Scanner  sc = new Scanner( System.in);
		
		
		code = sc.nextInt();
		time = sc.nextInt();
		
		
		switch( code) {
		case 1:
			wages= time*2000;
			break;
		case 2:
			wages= time* 2500;
			break;
		case 3:
			wages= time*3000;
			break;
		case 4:
			wages= time*4000;
			break;	
		default:
			System.out.println("잘못 ");
		
		}
		
		System.out.println( wages);
		
		
		

	}

}
