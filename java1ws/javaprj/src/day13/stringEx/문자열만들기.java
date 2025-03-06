package day13.stringEx;

public class 문자열만들기 {

	public static void main(String[] args) {

		
		//문자열 상수 영역에 만들어짐, 같은 문자열은 참조만 해서 사용함
		
		String str = "hello";
		String str2 = "hello";
		
		
		//
		if(str == str2) {
			System.out.println("주소가 같다");
		}else {
			System.out.println("주소가 같지 않아");
		}
		
		if(str.equals(str2)) {
			System.out.println("내용이 같다");
		}else {
			System.out.println("내용이 같지 않아요용ㅇ");
		}
		
		
		
		
		//힙 메모리에 두 개의 "hello" 객체가 만들어짐
		String str3 = new String("hello");
		String str4 = new String("hello");
		
		if(str3 == str4) {	//주소를 비교
			System.out.println("주소가 같다");
		}else {
			System.out.println("주소가 같지 않아");
		}
		
		if(str.equals(str4)) {
			System.out.println("내용이 같다");
		}else {
			System.out.println("내용이 같지 않아");
		}
	}

}
