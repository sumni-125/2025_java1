package day11.변수종류_초기화;

public class 지역변수 {

	public static void main(String[] args) {
		 
		
		// 매서드안에서 만들어지는 변수 
		// 매서드 호출시 변수가 생기고 매서드 반환시 사라짐  
		
		int result  =add(3,5);
		System.out.println( result );

	}
	
	public static int add( int su1, int su2) {
		
		               // su1, su2 매개변수도  => 지역변수 
		               // total  => 지역변수
		int total;
		total =su1 + su2;
		return total;
	}
	
	

}
 