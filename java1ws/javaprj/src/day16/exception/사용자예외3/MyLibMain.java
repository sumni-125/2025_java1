package day16.exception.사용자예외3;

public class MyLibMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//예외처리를 한다는 것은 
		//예외상황에 어떤 일을 처리하고 프로그램이 정상적인 종료를 할 수 있도록 하는 것이다 
		
	
		 
		
 
			
		MyLib b = new MyLib();
		
		
		boolean result =false;
		try {
			result  = b.isAdult(-1);
		    // result = b.isAdult(35);
		} catch (잘못된나이예외 e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			 
			 
		}
	 
		
		System.out.println( "프로그램 종료");

	}
	
	
	 

}
