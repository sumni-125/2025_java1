package day05.배열실습_학생.배열실습_이동우;

public class 배열2차원_점심메뉴 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[][] menu= {
				
				{"김밥", "라면", "햄버거", "분식", "돈까스"},
				{"김치찌개", "국밥", "우동", "도시락", "김밥"},
				{"덥밥", "김치나베", "파스타", "제육볶음", "샐러드"}
				
		};
		
//		System.out.println(menu[0][0]);
//		System.out.println(menu[0][1]);
//		System.out.println(menu[0][2]);
//		System.out.println(menu[0][3]);
//		System.out.println(menu[0][4]);
		
		for(int i = 0; i < menu.length; i++) {
			
			for(int j = 0; j < menu[i].length; j++) {
				System.out.println(menu[i][j]);
			}
		}
	}

}
