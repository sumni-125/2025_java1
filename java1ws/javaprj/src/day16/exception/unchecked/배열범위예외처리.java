package day16.exception.unchecked;

public class 배열범위예외처리 {

	public static void main(String[] args) {
		
   		//예외처리 
	    //unchecked : 예외처리가 선택적이다. 
		//unchecked Exception : 한 가지  => try~ catch  예외처리 
				
		
		
		int[] arr= {9,8,7,10};		
		
		try {
			for( int  i=0 ; i<= arr.length ; i++) {
				System.out.println( arr[i]);	 // arr[4]			
			}	
			//catch(Exception e) {
		}catch(ArrayIndexOutOfBoundsException  e) {
			
			//String  result  = e.getMessage();
			//System.out.println( result);
			
			//String result = e.toString();
			//System.out.println( result);
			
	      	e.printStackTrace();	
			//System.out.println("배열의 범위 벗어남 "); 
			
		}
		System.out.println(" 정상종료"); 
		

	}

}
