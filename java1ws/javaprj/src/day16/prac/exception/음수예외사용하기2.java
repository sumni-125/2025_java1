package day16.prac.exception;

public class 음수예외사용하기2 {

	public static void main(String[] args) {
		
		
		Calculator c= new Calculator();
		try {
			System.out.println(c.add(5, -3));
			
		} catch (음수예외 e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			
			String result = e.getMessage();
			System.out.println(result);
		}
		
		
		System.out.println("프로그램 종료");

	}

}
