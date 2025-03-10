package day16.io.객체읽기쓰기;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class 객체일기반복2 {

	public static void main(String[] args) {		 
	 
		 
			 
				try (ObjectInputStream oi   = new ObjectInputStream(  new FileInputStream("res/test0308.txt"))){
					 
					while(true) {
						
						try {
							Score  s = (Score)oi.readObject();
							System.out.println( s);
						}catch(EOFException e) {
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
				} 
			
				
				//상속관계에서 범위가 작은것 부터  catch 해야 함 
			 
		 
		
		

	}

}
