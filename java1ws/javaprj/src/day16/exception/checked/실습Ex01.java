package day16.exception.checked;

import java.io.IOException;
import java.util.Scanner;

public class 실습Ex01 {

	public static void main(String[] args) {
	 
		
		 //Scanner sc  = new Scanner(  System.in);
		 
		
		//키보드로부터 한 바이트 읽어오는 기능 
		
		 try {
			int ch  =System.in.read();
			System.out.println( (char)  ch ); 
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			// 
			System.out.println("예외발생 상관없이 무조건 수행");
			//자원의 반납코드
			 
			
		}

	}

}
