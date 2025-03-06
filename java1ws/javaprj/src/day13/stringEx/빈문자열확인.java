package day13.stringEx;

public class 빈문자열확인 {

	public static void main(String[] args) {
		
		String str = "";
		String str2 = " ";
		
		boolean result = str.isEmpty();//true
		boolean result2 = str2.isEmpty(); // false
		
		boolean result3 = str.isBlank();
		

		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		
		
	}
}
