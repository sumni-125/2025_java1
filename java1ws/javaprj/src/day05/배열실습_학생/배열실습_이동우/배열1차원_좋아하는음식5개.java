package day05.배열실습_학생.배열실습_이동우;

public class 배열1차원_좋아하는음식5개 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[] food = new String[5];
		
		food[0] = "치킨";
		food[1] = "피자";
		food[2] = "라면";
		food[3] = "제육볶음";
		food[4] = "김치찌개";
		
//		System.out.println(food[0]);
		
		for(int i = 0; i < food.length; i++) {
			System.out.println(food[i]);
		}
	}

}
