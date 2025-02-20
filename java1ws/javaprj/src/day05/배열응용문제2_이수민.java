package day05;

public class 배열응용문제2_이수민 {

	public static void main(String[] args) {
		//배열의 평균값보다 큰 요소의 개수 구하기
		int[]  Temperatures  =  { 33 ,35,32 ,35  ,36 ,35 ,34  }  ;
		
		int sum=0, avg, cnt=0;
		
		for(int i=0;i<Temperatures.length;i++) {
			sum+=Temperatures[i];
			
		}
		avg=sum/Temperatures.length;
		
		for(int i=0;i<Temperatures.length;i++) {
			if(Temperatures[i]>avg) {
				cnt++;
			}
		}
		System.out.println("배열의 평균값: "+avg);
		System.out.println("배열의 평균값보다 큰요소의 개수: "+cnt);

	}

}
