package day03;

public class 연산자_논리연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//논리연산자 && (그리고) =>모두 만족해야 참
		//		  || (이거나) => 한개만 만족해도 참
		
		int kor=80;
		int eng=90;
		
		
		boolean result1 = (kor>=90)&&(eng>=90);
		System.out.println(result1==true?"장학금지급":"장학금미지급");
		
		boolean result2 = (kor>=90)||(eng>=90);
		System.out.println(result2==true?"장학금지급":"장학금미지급");
		
		

	}

}
