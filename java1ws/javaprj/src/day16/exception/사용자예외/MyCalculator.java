package day16.exception.사용자예외;

public class MyCalculator {
	
	public int add( int num1, int num2) throws 음수예외checked   {
		if( num1< 0 || num2 <0) {
			// 예외를 일으키는 키워드  : throw 
			throw  new 음수예외checked( );  // 필수예외
			//throw new Exception("음수예외");
		}		
		return num1+ num2;
	}
	
	
	public int add2( int num1, int num2)    {
		if( num1< 0 || num2 <0) {
			// 예외를 일으키는 키워드  : throw 
			throw  new 음수예외unchecked();  //선택예외
		}		
		return num1+ num2;
	}
	
	

}
