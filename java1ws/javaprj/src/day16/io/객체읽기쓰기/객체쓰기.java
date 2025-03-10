package day16.io.객체읽기쓰기;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class 객체쓰기 {

	public static void main(String[] args) {
	 
		Score s = new Score("홍길동", 100);
		Score s2 = new Score("김길동",80);
		
		
		ObjectOutputStream  os=null;
		try {
			
			os = new ObjectOutputStream	 ( new FileOutputStream("res/output10.txt"));
			
			os.writeObject(s);
			os.writeObject(s2);
			os.flush();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				 os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
 		
		}
	
		
		
		

	}

}
