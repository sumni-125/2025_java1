package day16.io.file바이트;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class 실습FileInputStream {

	public static void main(String[] args) {
		 
		FileInputStream fis =null;
		try {
			  fis  = new FileInputStream("res/test.txt");   // FileNotFoundException  , IOException
			
			int ch  = fis.read();
			System.out.println( (char) ch);
			
		} catch (FileNotFoundException e) {           //범위가 좁은 쪽이 먼저 작성됨 
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			
			if( fis!= null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}

	}

}
