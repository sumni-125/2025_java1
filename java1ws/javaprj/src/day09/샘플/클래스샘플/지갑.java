package day09.샘플.클래스샘플;

import java.util.Arrays;

public class 지갑 {
	

	int 동전500;  
	int 만원;
	int 오천원;
	String[] 카드   ; 
	
	
	
	public void input( int 동전500  ,  int 만원 ,  int 오천원 , String[] card) {
		
		this.동전500=동전500*500;
		this.만원 = 만원*10000;
		this.오천원 = 오천원*5000;
		this.카드 = card;
		
	}
	
	public void printInfo() {
		System.out.println("지갑상태");
		
		System.out.println(동전500);
		System.out.println(만원);
		System.out.println(오천원);
		System.out.println( Arrays.toString( 카드));
	 
		
	}
	
	
	public void 물건구매하다( int cost) {
		if( 동전500 >=cost) {
			동전500 -=cost;
		}else if( 오천원 >=cost) {
			오천원-=cost;
		}else if( 만원 >=cost) {
			만원 -=cost;
		}
		 
	}
	
	
	public static void main( String[] args) {
		 지갑 a= new 지갑();
	
		 a.input(5, 10, 5, new String[]{ "롯데" ,"신한"});
		 a.printInfo();
		 a.물건구매하다(5000);
		 
		 a.printInfo();
	}
}
