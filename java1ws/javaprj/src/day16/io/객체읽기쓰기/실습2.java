package day16.io.객체읽기쓰기;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class 실습2 {

	public static void main(String[] args) {
		 
		
		
		//기반스트림  : FileInputStream 
		//보조스트림  : ObjectInputStream
		
		ObjectInputStream ois=null;
		try {
			  ois = new ObjectInputStream(  new FileInputStream("res/학생.txt"));
			
			Object o  = ois.readObject();
			Score s  = (Score)o;
			
			System.out.println(  s.toString());
			System.out.println(  s.getName());
			
			
			  o  = ois.readObject();
			  s  = (Score)o;
			
			System.out.println(  s.toString());
			System.out.println(  s.getName());
			
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			if(ois !=null) {
				try {
					ois.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
		
		

	}

}
