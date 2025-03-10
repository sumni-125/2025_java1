package day16.exception.사용자예외2;

public class Calculator2 {
	
	
	public int add( int su1, int su2) {
		
		if( su1  <0  || su2  <0) {
			throw new NegativeNumberException2();
		}
		
		return su1+su2;
		
	}

}
