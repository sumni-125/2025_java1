package day16.io.file바이트;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileEx00 {

	
	//파일  : 바이트스트림 : 입력용, 출력용  ( 그림, 문자 등 모든게 가능)
	//      문자스트림  : 입력용 , 출력용  (문자만 가능)
	public static void main(String[] args) {
	 
		//기반스트림
		FileInputStream fis= null; 
		try {
			 fis = new FileInputStream("res/test.txt");
			
			int data1=fis.read();
			System.out.println( (char)data1);
			
			data1=fis.read();
			System.out.println( (char)data1);
			
			
			fis.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}finally {
			
			
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}

}
