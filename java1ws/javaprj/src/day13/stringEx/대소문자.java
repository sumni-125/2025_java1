package day13.stringEx;

public class 대소문자 {

	public static void main(String[] args) {
		
		
		String str="hello";// 대문자로 변환
		
		String result = str.toUpperCase();
		System.out.println(result);
		
		String str2="HELLO";
		String result2 = str2.toUpperCase();
		
		
		/*
		 * 
		 * 'A' -> 65		'a' -> 97		'0' -> 48
		 * 
		 * 32를 더하거나 빼면 대문자 소문자로 변환이 가능함
		 */
	}

}
