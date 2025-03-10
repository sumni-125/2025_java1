package day16.io.객체읽기쓰기;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class 객체일기반복 {

	public static void main(String[] args) {		 
	 
		 
				ObjectInputStream oi=null;
				try {
					oi = new ObjectInputStream(  new FileInputStream("res/output10.txt"));
					
					
					while(true) {
						
						try {
							Score  s = (Score)oi.readObject();
							System.out.println( s);
						}catch( EOFException e) {
							System.out.println( "다 읽었음");	
							break;
						}
					}			
			 
				}catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					
					try {
						oi.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
	
			
				
				//상속관계에서 범위가 작은것 부터  catch 해야 함 
			 
		 
		
		

	}

}
