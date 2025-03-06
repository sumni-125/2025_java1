package day13.stringEx;

public class equals {

	public static void main(String[] args) {
		
		//문자열클래스
		//String 클래스
		
		//데이터(char[]) - 데이터 보호(밖에서 안보임)
		//메서드제공( 데이터를 사용하는 방법)
		
		
		//문자열이 같은지 판단하기
		//equals 메서드 사용하기 > 같으면 true, 같지 않으면 false 반환
		
		String str = "hello";
		String str2 = "helle";
		
		boolean result = str.equals(str2);
		System.out.println(result);
		
		char[] str3 = {'h','e','l','l','o'};
		char[] str4 = {'h','e','l','l','o'};
		
		boolean flag = true;
		for(int i=0;i<5;i++) {
			if(str3[i]!=str4[i]) {
				flag=false;
				break;
			}
		}
		System.out.println(flag);
		
	}

}
