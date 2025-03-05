package day13.objectEx;

public class equals사용하기 {

	public static void main(String[] args) {

		Score s = new Score(90,100);
		Score s2 = new Score (90,100);
		
		//두개의 성적 비교하기
		//equals메서드 사용하여 두 객체 비교하기
		//주소를 비교하서 같으면 true
		
		boolean result = s.equals(s2);
		System.out.println(result);
		
		
		Object o1 = s;
		Object o2 = s2;
		
		if(o1.equals(o2)) {
			System.out.println("두 객체는 같다");
		}else {
			System.out.println("두 객체는 같지 않다");
		}
		
		
	}

}
