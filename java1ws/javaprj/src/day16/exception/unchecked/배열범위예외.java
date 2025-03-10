package day16.exception.unchecked;

public class 배열범위예외 {

	public static void main(String[] args) {
		
      //예외  Exception :  예외상황이 발생했을 때 대비하는 코드를 작성하는것으로 정상적인 프로그램 종료를 시킬 수 있다
	  // 
		
		
		//          0 1  2 3   4
		int[] arr= {9,8,7,10};		
		
		for( int  i=0 ; i<= arr.length ; i++) {
			System.out.println( arr[i]);
			
		}		
		
		System.out.println(" 정상종료");
		
		
		//예외처리 
		//선택예외 : 예외처리가 선택적이다. 
		//선택예외방법 : 한 가지  => try~ catch  예외처리 
		
		
		

	}

}
