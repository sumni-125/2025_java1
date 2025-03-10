package day16.prac.exception;

public class Ex05 {

	public static void main(String[] args) {
		
		
		//
		
		
		Object o =new Object();
		try {
			((A)o).놀기();
		}catch(ClassCastException e) {
			String str = e.getMessage();
			System.out.println(str);
		}
		
		System.out.println("프로그램 정상종료");
		
		
		
	}

}
