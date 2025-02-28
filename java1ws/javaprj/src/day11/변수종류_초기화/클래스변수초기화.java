package day11.변수종류_초기화;

class Lotto{
	static int[] Lotto = new int[5];
	static int cnt=5;	//명시적 초기화
	//static int cnt;	//기본값 초기화
	
	
	//static 초기화 블럭
	static {
		for(int i=0;i<Lotto.length;i++) {
			int random = (int) (Math.random()*45)+1;
			Lotto[i]=random;
		}
	}
	
	
	public static void printLotto() {
		//System.out.println(Lotto);
		for(int i=0;i<Lotto.length;i++) {
			System.out.print(Lotto[i]+", ");
		}
	}
	
	public static void printCnt() {
		System.out.println(cnt);
	}
	
	public static void init() {
		for(int i=0;i<Lotto.length;i++) {
			int random = (int) (Math.random()*45)+1;
			Lotto[i]=random;
		}
	}
}


public class 클래스변수초기화 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lotto.printLotto();
		
		/*
		 * 클래스 변수 초기화
		 * 1. 기본값으로 초기화
		 * 2. 명시적 초기화
		 * 3. 스태틱 초기화 블럭: 복잡한 초기화
		 * 	static{
		 * 			
		 * }
		 */
		
		/*
		 * 프로그램의 시작순서 main 에서 시작함
		 * static 정보가 먼저 로드됨
		 * static 초기화 블럭이 실행됨
		 * static main을 실행시킴
		 * 
		*/
		
	}

}
