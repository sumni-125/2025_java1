package day16.prac.io.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex04 {

	public static void main(String[] args) throws IOException {

		
		try(FileInputStream fis = new FileInputStream("res/input.txt")) {
			int data1;
			
			data1= fis.read();
			System.out.println((char)data1);
			
			data1= fis.read();
			System.out.println((char)data1);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
	}

}
