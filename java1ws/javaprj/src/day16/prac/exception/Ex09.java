package day16.prac.exception;

import java.io.IOException;

public class Ex09 {
	
	//최종적으로 main메서드까지 예외를 미룰 수 있다
	//main까지 미루게 되면 예외를 처리하지 않는 코드로 작동된다.
	//=> 예외를 처리하지 않는 코드와 동일하다( 예외처리를 하지 않는 방법으로 사용될 수도 있다)
	public static void main(String[] args) {
		// 

		//키보드로부터읽어오기();
		
		System.out.println("프로그램 종료");
		
	}
	
	/* 직접 예외처리하기
	 * public static void 키보드로부터읽어오기() {
		try {
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	 */
	
	//예외미루기
	//메서드를 호출한 쪽으로 예외가 넘어감
	public static void 키보드로부터읽어오기() throws IOException {
		System.in.read();
	}

}
