package day16.prac.exception;

public class Ex06 {

	public static void main(String[] args) {
		
		String str1 ="100";
		String str2 ="hello";
		
		//숫자형태로 된 문자열 => 실제 숫자로 변환
		//라이브러리 제공됨
		//Integer.parseInt(String str);
		
		int result1 = Integer.parseInt(str1);
		System.out.println(result1+10);
		
		try {
			
			int result2 = Integer.parseInt(str2);
			
		}catch(NumberFormatException e) {
			//e.printStackTrace();
			System.out.println("숫자입력");
		}
		
		System.out.println("프로그램 종료");
		
		//Object o = new NumberFormatException(); => 이것도 가능은 함
		
		
	}
}
