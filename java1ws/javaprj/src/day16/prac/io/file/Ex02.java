package day16.prac.io.file;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex02 {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("res/input.txt");

		int data = fis.read();
		System.out.print((char) data);
		
		data = fis.read();
		System.out.print((char) data);
		
		data = fis.read();
		System.out.print((char) data);
		
		data = fis.read();
		System.out.print((char) data);
		
		data = fis.read();
		System.out.print((char) data);
		
		/*
		 * 
		 * for(int i=0;i<5;i++){
		 * 	int data = fis.read();
		 * 	System.out.print(data);
		 * }
		 */

	}

}
