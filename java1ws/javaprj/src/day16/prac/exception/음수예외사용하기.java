package day16.prac.exception;

public class 음수예외사용하기 {

	public static void main(String[] args) {
		
		
		int su1 = 10;
		int su2 = -5;
		
		
		Calculator c = new Calculator();
		int result = 0;
		try {
			result = c.add(su1, su2);
		} catch (음수예외 e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(result);
		
	}

}
