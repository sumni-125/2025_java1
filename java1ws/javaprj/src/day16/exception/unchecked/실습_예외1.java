package day16.exception.unchecked;

public class 실습_예외1 {

	public static void main(String[] args) {
		 
		
		
		//                  0 1 2
			int[] arr  = { 10,9,15};
			
			
			try {
			
				//예외가 발생하면 해당하는 예외객체가 만들어짐 
				//catch블럭으로 제공됨
				for( int i=0 ; i<= arr.length ; i++) {				
					System.out.println( arr[i ]);
				}
			    //예외발생했을 때 대비코드 작성함 
			}catch(  ArrayIndexOutOfBoundsException  e) {
				
				//e.getMessage();
				//e.toString();
				//e.printStackTrace();
				System.out.println("배열의 범위 벗어남");
				
				
			}
			
			System.out.println(" 프로그램 정상 종료");

	}

}
