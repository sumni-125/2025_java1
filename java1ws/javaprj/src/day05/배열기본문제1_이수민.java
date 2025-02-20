package day05;

public class 배열기본문제1_이수민 {

	public static void main(String[] args) {
		/*
		 1. 배열저장출력문제    (값 넣고  출력하기)
   			1) 1차원배열 사용하기 -  일주일점심메뉴 또는 단어  
   			2) 1차원배열 사용하기 -  예상 로또번호  저장하고 출력하기
   			3) 1차원 배열 사용하기 - 좋아하는 음식  5개 저장하고 출력하기
   			4) 2차원배열 사용하기 -  한 달 점심메뉴 또는 단어
   			5) 3차원배열 사용하기
		 */
		
		String[] arr1 = new String[] {"😀","😁","😂","🤣","😃"};
		
		for (int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]);
		}
		
		System.out.println("\n");
		
		int[] lotto = {3,9,27,28,38,39};
		
		System.out.println("이번주 당첨번호는?");
		
		for (int i=0;i<lotto.length;i++) {
			System.out.print(lotto[i]+" ");
		}
		
		System.out.println("\n");
		
		//점심메뉴 저장하기(2차원배열)
		String[][] month_lunch = {
				{"백반","비빔밥","돌솥비빔밥","꼬막비빔밥","오므라이스"},
				{"오징어덮밥","제육덮밥","김치볶음밥","치킨마요덮밥","죽"},
				{"닭갈비","찜닭","제육볶음","샤브샤브","주꾸미볶음"},
				{"고등어조림","떡볶이","순대","김밥","만두"}
		};
		
		System.out.println("=====점심메뉴 추천 (2차원배열)=====\n");
		
		for(int i=0; i<month_lunch.length;i++) {
			
			for(int j=0;j<month_lunch[i].length;j++) {
				System.out.print(month_lunch[i][j]+" ");
			}
			System.out.println();
		}
		
		//점심메뉴 저장하기(3차원배열)
		String[][][] month_lunch2 = {
				{
					{"백반","비빔밥","돌솥비빔밥","꼬막비빔밥","오므라이스"},
					{"오징어덮밥","제육덮밥","김치볶음밥","치킨마요덮밥","죽"}
				},
				{
					{"닭갈비","찜닭","제육볶음","샤브샤브","주꾸미볶음"},
					{"고등어조림","떡볶이","순대","김밥","만두"}
				},
				
		};
		
		System.out.println();
		
		
		System.out.println("=====점심메뉴 추천 (3차원배열)=====\n");
		
		for(int i=0; i<month_lunch2.length;i++) {

			for(int j=0;j<month_lunch2[i].length;j++) {
				
				for(int k=0;k<month_lunch2[i][j].length;k++) {
				
					System.out.print(month_lunch2[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}

}
