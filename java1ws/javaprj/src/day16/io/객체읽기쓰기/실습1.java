package day16.io.객체읽기쓰기;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class 실습1 {

	public static void main(String[] args) {
		 
		
		Score s = new Score("권지언",100);		
		Score s2 = new Score("이동우",99);
		
		
		//객체를 파일에 쓰기 (byte Stream)
		//기반스트림  FileOutputStream 
		//보조스트림  ObjectOutputStream 
		
		ObjectOutputStream oos =null;
		
		try {
			 oos  = new ObjectOutputStream( new FileOutputStream("res/학생.txt"));		
			 
			oos.writeObject(s);			 
			oos.writeObject(s2);			
			oos.flush();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			if(  oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
		
		

	}

}
