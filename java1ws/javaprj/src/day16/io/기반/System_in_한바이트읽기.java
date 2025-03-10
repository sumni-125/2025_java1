package day16.io.기반;

import java.io.IOException;
import java.util.Scanner;

public class System_in_한바이트읽기 {

	public static void main(String[] args) {
		 
		
		//스트림 : 데이터 들어오고 나가는 길 
		// 입력스트림 : 들어오는 길
		// 출력스트림 : 나가는 길 
		
		//위의 두 개가 실제기능이 있는 
		//기반스트림 
	 
		
		//보조스트림을 사용할 수 있다.  ( 한 문자로 다뤄야 할 때  ,  성능을 위해서도  )
		//보조스트림은 생성될 때 반드시 기반스트림을 제공받아야 된다
		//단독으로 생성될 수 없다.
		
		//InputStreamReader
		//BufferedReader 
		//Scanner
		
		 
		
		
		//키보드로 부터 데이터를 읽어올수 있는 기반 스트림  System.in
		
		
		try {
			int ch  =System.in.read();
			System.out.println( (char) ch);
			
		
			 ch  =System.in.read();
			System.out.println( (char)  ch);
			
			
			 ch  =System.in.read();
			System.out.println( (char) ch);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
