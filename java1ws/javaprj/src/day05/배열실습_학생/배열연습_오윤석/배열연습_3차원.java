package day05.배열실습_학생.배열연습_오윤석;

public class 배열연습_3차원 {

	public static void main(String[] args) {
		
		String[][][] 음식 = {
				{
					{"김치찌개", "된장찌개", "제육볶음", "비빔밥", "삼겹살"},
					{"칼국수", "우동", "짜장면", "짬뽕", "쌀국수"}
				},
				{
					{"오므라이스", "카레라이스", "규동", "치킨마요덮밥", "마파두부덮밥"},
					{"햄버거", "피자", "파스타", "치킨", "브리또"}
				}
		};
		
		System.out.println(음식[0][0][0]);
		System.out.println(음식[0][0][1]);
		System.out.println(음식[0][0][2]);
		System.out.println(음식[0][0][3]);
		System.out.println(음식[0][0][4]);
		
		System.out.println(음식[0][1][0]);
		System.out.println(음식[0][1][1]);
		System.out.println(음식[0][1][2]);
		System.out.println(음식[0][1][3]);
		System.out.println(음식[0][1][4]);
		
		System.out.println(음식[1][0][0]);
		System.out.println(음식[1][0][1]);
		System.out.println(음식[1][0][2]);
		System.out.println(음식[1][0][3]);
		System.out.println(음식[1][0][4]);
		
		System.out.println(음식[1][1][0]);
		System.out.println(음식[1][1][1]);
		System.out.println(음식[1][1][2]);
		System.out.println(음식[1][1][3]);
		System.out.println(음식[1][1][4]);
		
		System.out.println("========반복문========");
		
		for (int i=0; i<음식.length; i++) {
			for (int j=0; j<2; j++) {
				for (int k=0; k<5; k++) {
					System.out.print(음식[i][j][k]+" ");
				}
				System.out.println();
			}
		}

	}

}
