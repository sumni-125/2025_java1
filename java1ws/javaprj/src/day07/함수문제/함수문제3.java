package day07.함수문제;

public class 함수문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] days = {"월요일","화요일","수요일","목요일","금요일","토요일","일요일"};
		int[] weeklyTemp = weeklyWeather();
		
		
		System.out.println("주간날씨정보를 출력합니다");
		for(int i=0;i<days.length;i++) {
			System.out.print(days[i]+" 최고기온: "+weeklyTemp[i]+"도, ");
		}
		
	}
	
	public static int[] weeklyWeather() {
		int[] weeklyTemp =  { 33 ,35,32 ,35  ,36 ,35 ,34  }  ;

		return weeklyTemp;
	}
}
