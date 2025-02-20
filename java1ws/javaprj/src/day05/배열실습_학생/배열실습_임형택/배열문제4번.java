package day05.배열실습_학생.배열실습_임형택;

public class 배열문제4번 {

	public static void main(String[] args) {
		
		String [][] lunch_month = {
				{"카레","우동","라면","김밥","돈까스"},
				{"떡볶이","초밥","곱창","삼겹살","막창"}
			};
		
		
		System.out.println("한달 점심 메뉴입니다");
		for(int i=0; i<2; i++) {
			for(int j=0; j<5; j++) {
				System.out.println(lunch_month[i][j]);
			}
		}
		
		
		
	}

}
