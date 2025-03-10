package day16.exception.사용자예외2;

public class Calculator2Main {

	public static void main(String[] args) {
	 
		
		//RuntimeException 상속받은 예외클래스들은  예외처리가 선택 ( unchecked Exception) 
		
		/*
		try {
			Calculator2 c  = new Calculator2();
			int result  =c.add(5, -3);	  //예외가 발생하면 	바로 catch블럭으로 넘어감 	
			
			System.out.println( result);
		}catch(NegativeNumberException2  e ) {
			System.out.println( e.toString());
		}
		
		
		*/
		Calculator2 c  = new Calculator2();
		int result  =c.add(5, -3);	  //예외가 발생하면 	바로 catch블럭으로 넘어감
		
		System.out.println("프로그램 정상 종료");
		

	}

}
