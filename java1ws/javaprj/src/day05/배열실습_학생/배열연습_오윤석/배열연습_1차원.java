package day05.배열실습_학생.배열연습_오윤석;

public class 배열연습_1차원 {

	public static void main(String[] args) {

		String[] 점심메뉴 = new String[7];

		점심메뉴[0] = "제육덮밥";
		점심메뉴[1] = "초밥";
		점심메뉴[2] = "라면";
		점심메뉴[3] = "햄버거";
		점심메뉴[4] = "순두부찌개";
		점심메뉴[5] = "닭갈비";
		점심메뉴[6] = "돈까스";

		System.out.println(점심메뉴[0]);
		System.out.println(점심메뉴[1]);
		System.out.println(점심메뉴[2]);
		System.out.println(점심메뉴[3]);
		System.out.println(점심메뉴[4]);
		System.out.println(점심메뉴[5]);
		System.out.println(점심메뉴[6]);

		
		System.out.println("===========================");
		System.out.println("로또번호 출력하기");

		String[] 로또번호 = { "6", "13", "20", "22", "31", "39" };

		for (int i = 0; i < 로또번호.length; i++) {
			System.out.print(로또번호[i] + " ");
		}

		
		System.out.println();
		System.out.println("===========================");
		System.out.println("음식 5개 출력하기");

		String[] 좋아하는음식 = { "제육볶음", "순두부찌개", "돈까스", "초밥", "치킨" };

		for (int i = 0; i < 좋아하는음식.length; i++) {
			System.out.println(좋아하는음식[i]);
		}
	}

}
