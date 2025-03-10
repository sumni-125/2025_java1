package day16.exception.사용자예외2;

public class CalculatorMain {

	public static void main(String[] args) {
		 
		
		Calculator c = new Calculator();
		try {
			int result  = c.add(5, -2);  // checked 예외
			System.out.println( result);
		} catch (NegativeNumberException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("음수 덧셈 불가");
		}
		
		
		System.out.println(" 프로그램  정상종료") ;

	}

}
