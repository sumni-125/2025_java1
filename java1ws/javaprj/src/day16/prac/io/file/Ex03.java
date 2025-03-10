package day16.prac.io.file;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex03 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		FileInputStream fis = new FileInputStream("res/input2.txt");
		
		//파일을 생성하면 파일의 끝을 알리는 문자가 같이 저장된다. 문자의 아스키코드 값이 -1이다.
		
		while(true) {
			int data = fis.read();
			if(data==-1)break;	//파일의 끝을 알 수 있는 값
			System.out.print((char)data);
		}
		
		
		
		
		System.out.println("\n프로그램종료");
		
		
		
		
	}

}
