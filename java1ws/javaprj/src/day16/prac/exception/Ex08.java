package day16.prac.exception;

import java.io.IOException;

public class Ex08 {

	public static void main(String[] args) throws IOException {
		
		
		//checked 예외를 처리하는 두 번째 방법
		//throws 예외 미루기, 예외 던지기
		//호출한 쪽에서 예외를 처리하도록 예외 미루기를 할 수 있다.
		int result = System.in.read();
		
		System.out.println(result);
		System.out.println((char)result);
		
		
	}

}
