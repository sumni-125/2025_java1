package day16.prac.io;

import java.io.IOException;
import java.io.InputStreamReader;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 키보드로부터 한글 읽기
		//=> 기반스트림 (바이트스트림만 제공됨)으로만 사용하면 한글이 깨짐
		//=> 보조스트림을 제공함
		
		
		//InputStreamReader is = new InputStreamReader();// 기본생성자를 제공하지 않는다.
		InputStreamReader is = new InputStreamReader(System.in);// 기본생성자를 제공하지 않는다.
		
		try {
			int data = is.read();
			System.out.println(data);
			System.out.println((char)data);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
