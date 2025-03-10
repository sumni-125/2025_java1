package day16.prac.exception;

public class 음수예외상용하기_runtimeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Calculator c = new Calculator();
		
		int result = c.add2(3, 5);
		System.out.println(result);
		int result2 = c.add2(-3, 5);
		System.out.println(result2);
		
		System.out.println("프로그램 종료");
		
		
	}

}
