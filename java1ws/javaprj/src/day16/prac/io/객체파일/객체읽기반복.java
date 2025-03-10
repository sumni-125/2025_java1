package day16.prac.io.객체파일;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class 객체읽기반복 {

	public static void main(String[] args) {
		
		//기반스트림 FileInputStream
		//보조스트림 ObjectInputStream
		
		try {
			ObjectInputStream oi = new ObjectInputStream(new FileInputStream("res/objOutput.txt"));
			
			while(true) {
		
				try {
				Score s = (Score)oi.readObject();
				System.out.println(s.toString());
				}catch(EOFException e) {
					break;
				}
			}
		
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
