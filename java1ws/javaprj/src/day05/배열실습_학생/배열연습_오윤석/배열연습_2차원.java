package day05.배열실습_학생.배열연습_오윤석;

public class 배열연습_2차원 {

	public static void main(String[] args) {

		String[][] 과일 = {
				{"사과", "바나나", "포도", "오렌지", "수박"},
				{"메론", "딸기", "체리", "망고", "복숭아"},
				{"자두", "레몬", "파인애플", "블루베리", "키위"}
		};
		
		System.out.print(과일[0][0]);
		System.out.print(과일[0][1]);
		System.out.print(과일[0][2]);
		System.out.print(과일[0][3]);
		System.out.println(과일[0][4]);
		
		System.out.print(과일[1][0]);
		System.out.print(과일[1][1]);
		System.out.print(과일[1][2]);
		System.out.print(과일[1][3]);
		System.out.println(과일[1][4]);
		
		System.out.print(과일[2][0]);
		System.out.print(과일[2][1]);
		System.out.print(과일[2][2]);
		System.out.print(과일[2][3]);
		System.out.println(과일[2][4]);
		
		System.out.println("===========================");
		System.out.println("한달점심");
				
		String[][] 한달점심 = {
				{"김치찌개", "된장찌개", "제육볶음", "비빔밥", "삼겹살", "순두부찌개", "닭갈비"},
				{"칼국수", "우동", "짜장면", "짬뽕", "쌀국수", "비빔국수", "라면"},
				{"오므라이스", "카레라이스", "규동", "치킨마요덮밥", "마파두부덮밥", "어향가지덮밥", "김치볶음밥"},
				{"햄버거", "피자", "파스타", "치킨", "브리또", "케밥", "스테이크"}
		};
		
		for (int i=0; i<한달점심.length; i++) {
			for (int j=0; j<7; j++) {
				System.out.print(한달점심[i][j]+" ");
			}
			System.out.println();
		}

	}

}
