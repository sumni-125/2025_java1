package day16.io.file바이트;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class 실습FileInputStream2 {

	public static void main(String[] args) {
		 
		
		//리소스 자동 닫기해주는 문법 
		
		try ( FileInputStream fis   = new FileInputStream("res/test.txt")  ){    
			
			int ch  = fis.read();
			System.out.println( (char) ch);
			
		} catch (FileNotFoundException e) {           //범위가 좁은 쪽이 먼저 작성됨 
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}
