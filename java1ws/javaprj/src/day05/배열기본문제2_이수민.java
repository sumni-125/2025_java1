package day05;

public class 배열기본문제2_이수민 {

	public static void main(String[] args) {
		/*
		 2.  기본배열문제
  			이번주 날씨 정보가 배열로 제공되었다
  			int[]  Temperatures  =  { 33 , 35, 32 ,35  ,36 ,35 ,34  }  ;


			1) 이번주 날씨정보를 출력하시오
			2) 평균온도를 구하시오
			3) 35도가 넘는 날의 횟수를 구하시오
			4) 가장 높은 온도를 구하시오
  
		  
		 */
		
		int[]  Temperatures  =  { 33 , 35, 32 ,35  ,36 ,35 ,34  };
		int t_avg=0, t_sum=0, over_cnt=0, t_max=0;
		
		System.out.println("이번주 날씨정보는?");
		
		for(int i=0;i<Temperatures.length;i++) {
			System.out.print(Temperatures[i]+"도 ");
			t_sum+=Temperatures[i];
			if(Temperatures[i]>35) {
				over_cnt++;
			}
			if(Temperatures[i]>t_max) {
				t_max=Temperatures[i];
			}
		}
		System.out.println();
		t_avg=t_sum/Temperatures.length;
		System.out.println("평균온도: "+t_avg+"도");
		System.out.println("35도가 넘는 날의 횟수: "+over_cnt+"회");
		System.out.println("가장 높은 온도: "+t_max+"도");
				
		
	}

}
