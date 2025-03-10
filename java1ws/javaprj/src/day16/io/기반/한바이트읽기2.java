package day16.io.기반;

import java.io.IOException;
import java.io.InputStreamReader;

public class 한바이트읽기2 {

	public static void main(String[] args) {
		 
		//입출력스트림
		// 입력스트림  (데이터가 들어오는 길  (입력전용 메모리버퍼) 
		// 출력스트림  (데이터가 나가는 길   (출력전용 메모리버퍼)
		
		
		//기반스트림(실제로 데이타를 읽고 쓰고 하는 기능)
		//보조스트림(부가기능)
		 
		try {
			int su = System.in.read();
			System.out.println(  su);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//보조스트림이 필요해짐
	
	}

}
