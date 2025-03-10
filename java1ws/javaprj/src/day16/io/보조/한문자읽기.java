package day16.io.보조;

import java.io.IOException;
import java.io.InputStreamReader;

public class 한문자읽기 {

	public static void main(String[] args) {

		//보조스트림은 기반스트림 정보를 받아야 사용할 수 있다.
		//보조스트림은 실제적인 데이터의 읽기와 쓰기가 불가능하다 
		//보조역할을 한다
		
		//한 문자씩 읽어옴
		InputStreamReader  is = new InputStreamReader( System.in);		
		try {
			int data  =is.read();
			System.out.println(  (char) data);	
			System.out.println(  data);	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
