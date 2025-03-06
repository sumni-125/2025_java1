package day13.stringEx;

public class split {

	public static void main(String[] args) {
		
		//문자열을 분리할 때 사용
		//문자열 배열로 반환함
		
		String str = "aaa-bbb-ccc";
		String[] result = str.split("-");
		
		for(int i=0;i<result.length;i++) {
			System.out.println( result[i]);
		}
		
	}

}
