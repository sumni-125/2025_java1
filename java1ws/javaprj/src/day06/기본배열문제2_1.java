package day06;

public class 기본배열문제2_1 {

	public static void main(String[] args) {
		
		
		  int[]  Temperatures  =  { 33 , 35, 32 ,35  ,36 ,35 ,34  }  ;
		  
		 // 이번주 날씨정보 출력
		  for (int i=0; i<Temperatures.length; i++) {
			  System.out.println(Temperatures[i]);
		  }
		  
		  System.out.print("===================================");
		  System.out.println();
		  
		  //평균온도
		  int sum = 0;
		  int num = 0;
		  int result = 0;
		  for (int i=0; i<Temperatures.length; i++) {
			  num = Temperatures[i];
			  sum += num;
			  
		  }
		  result = sum / Temperatures.length;
		  System.out.println(result);
		  
		  System.out.print("===================================");
		  System.out.println();
		  
		  int count = 0;
		  
		  //35도가 넘는 날씨 구하기
		  for(int i=0; i<Temperatures.length; i++) {
			  if(Temperatures[i]>35) {
				  count ++;
				  System.out.println(count);
			  }
			  
		  }
		  System.out.println(count);
		  
		  System.out.print("===================================");
		  System.out.println();
		  int big = 0;
		  
		  //가장 높은 온도 구하기
		  for(int i=0; i<Temperatures.length; i++) {
			  if(Temperatures[i] >big) {
				  big = Temperatures[i];
				  System.out.println(Temperatures[i]); 
			  }
			 
		  }
		  
		  
	}

}
