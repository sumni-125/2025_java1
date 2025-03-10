package day16.io.객체읽기쓰기;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class 실습3 {

	public static void main(String[] args) {


		
		//
		ObjectInputStream ois=null;
		try {
			  ois  = new ObjectInputStream (  new FileInputStream( "res/학생.txt")); 
				
				 
					
				while(true) {
					
					try {
						Object o  =ois.readObject(); 
						Score s  =(Score)o; 
						System.out.println(  s.getName());
					
					}catch( EOFException e) {
						
						System.out.println("다 읽음");
						break;
					}
				}
					 
			
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			
			if( ois !=null) {
				try {
					ois.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
		
		System.out.println(" 프로그램 정상 종료");
		
	}

}
