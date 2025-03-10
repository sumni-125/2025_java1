package day16.exception.사용자예외;

public class MyCalculatorTest {

	public static void main(String[] args) {
		
		MyCalculator  c = new MyCalculator();
	 
		int result=0;
		try {
			result = c.add( -5, 3);
		} catch (음수예외checked e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
		}  //예외처리 필수적으로 해야 함 
		System.out.println(result);
		 	
		
		int result2 = c.add2(5, 0);
		System.out.println( result2);		

		System.out.println(" 정상종료");
	}

}
