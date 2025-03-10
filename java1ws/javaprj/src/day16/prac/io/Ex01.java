package day16.prac.io;

import java.io.IOException;

public class Ex01 {

	public static void main(String[] args) {
		//
		
		//표준입출력(키보드, 모니트)
		//static 제공
		//System.in
		//System.out
		
		
		//read()
		//키보드로부터 입력한 내용을 한 바이트씩 읽어옴
		//아스키코드값
		
		//97	'a'
		
		//65	'A'
		
		//48	'0'
		
		try {
			int result = System.in.read();
			System.out.println((char)result);
			
			result = System.in.read();
			System.out.println((char)result);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
