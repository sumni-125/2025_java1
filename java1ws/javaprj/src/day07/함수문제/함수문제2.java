package day07.함수문제;

public class 함수문제2 {

	public static void main(String[] args) {
		// 2. 날씨정보를 반환하는 함수 만들기 (임의의 날씨 정보)
		System.out.println("오늘의 기온은 "+weather()+"도 입니다.");

	}
	public static int weather() {
		 int[]  Temperatures  =  { 33 ,35,32 ,35  ,36 ,35 ,34  }  ;
		 int i=(int)(Math.random()*7);
		 return Temperatures[i];
	}
}
