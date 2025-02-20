package day05.배열실습_학생.실습_배열_김유민;

public class 실습_배열2차원_김유민_한달점심메뉴 {

	public static void main(String[] args) {
		
		String lunch_menus[][] = {
				
				{"비빔밥","불고기","김치찌개","된장찌개","갈비탕","떡볶이","순두부찌개"},
				{"라면","제육볶음","오징어볶음","잡채","김밥","치킨","피자"},
				{"햄버거","스시","파스타","샐러드","오므라이스","떡국","냉면"},
				{"삼겹살","전","김치전","갈비구이","쌀국수","유린기","양장피"}
				
		};
		
		System.out.println("-배열상 위치로 출력-");
		System.out.println();
		
		System.out.println("★1주차 메뉴★");
		System.out.println(lunch_menus[0][0]);
		System.out.println(lunch_menus[0][1]);
		System.out.println(lunch_menus[0][2]);
		System.out.println(lunch_menus[0][3]);
		System.out.println(lunch_menus[0][4]);
		System.out.println(lunch_menus[0][5]);
		System.out.println(lunch_menus[0][6]);
		System.out.println();
		
		System.out.println("★2주차 메뉴★");
		System.out.println(lunch_menus[1][0]);
		System.out.println(lunch_menus[1][1]);
		System.out.println(lunch_menus[1][2]);
		System.out.println(lunch_menus[1][3]);
		System.out.println(lunch_menus[1][4]);
		System.out.println(lunch_menus[1][5]);
		System.out.println(lunch_menus[1][6]);
		System.out.println();
		
		System.out.println("★3주차 메뉴★");
		System.out.println(lunch_menus[2][0]);
		System.out.println(lunch_menus[2][1]);
		System.out.println(lunch_menus[2][2]);
		System.out.println(lunch_menus[2][3]);
		System.out.println(lunch_menus[2][4]);
		System.out.println(lunch_menus[2][5]);
		System.out.println(lunch_menus[2][6]);
		System.out.println();
		
		System.out.println("★4주차 메뉴★");
		System.out.println(lunch_menus[3][0]);
		System.out.println(lunch_menus[3][1]);
		System.out.println(lunch_menus[3][2]);
		System.out.println(lunch_menus[3][3]);
		System.out.println(lunch_menus[3][4]);
		System.out.println(lunch_menus[3][5]);
		System.out.println(lunch_menus[3][6]);
		System.out.println();
		
		
		
		System.out.println("-반복문으로 출력-");
		
		for(int i=0;i<lunch_menus.length;i++) {
			System.out.println();
			System.out.println((i+1) + "주차 메뉴");
			
			for(int j=0;j<lunch_menus[i].length;j++) {
				System.out.println(lunch_menus[i][j]);
			}
		}

	}

}
