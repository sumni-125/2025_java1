package day16.exception.unchecked;

public class 실습_예외5 {

	public static void main(String[] args) {
		 
		// Object 상속  (강제되어 있음)
		
		
		// Object 부모(super)   - A (자식)sub 
		
		
		try {
		
			A a = new A();
		
			Object o  = a;   // 업캐스팅  ,  부모형만큼만 해석되어짐, 놀기() 매서드 사용 불가 
			
			
			//o가 참조하는 객체의 놀기 매서드를 실행하는 방법
			//다운캐스팅을 해야함 
			
			
			
			//잘못된 다운캐스팅 
			// runtime exception  발생
			
			((B)o).공부하기();
		
		
		}catch( Exception e) {   // ClassCastException   => 부모형  Exception 으로 다뤄질 수 있다.
			 System.out.println( e.toString() );
			 //
			 //예외 되던지기 !! 
			 
			 throw e;   // 다시 예외 일으키기
			
		}
		
		
		
		System.out.println(" 프로그램 정상 종료");
		 
		
		

	}

}
