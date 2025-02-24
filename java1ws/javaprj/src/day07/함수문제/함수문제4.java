package day07.함수문제;

public class 함수문제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] menu = {
				{"백반","비빔밥","돌솥비빔밥","꼬막비빔밥","오므라이스"},
				{"오징어덮밥","제육덮밥","김치볶음밥","치킨마요덮밥","죽"},
				{"닭갈비","찜닭","제육볶음","샤브샤브","주꾸미볶음"},
				{"고등어조림","떡볶이","순대","김밥","만두"}
		};
		
		System.out.println("오늘의 추천메뉴: "+rendomMenu(menu));
	}
	public static String rendomMenu(String[][] menu) {
		
		int i=(int)(Math.random()*menu.length);
		int j=(int)(Math.random()*menu[i].length-1);
		
		return menu[i][j];
	}
}
