package day16.prac.io;

import java.io.IOException;
import java.io.InputStreamReader;

public class Ex05 {

	public static void main(String[] args) {
		// 
		
		InputStreamReader is = new InputStreamReader(System.in);
		
		
		while(true) {
			try {
				int data = is.read();
				if(data == '\n') break;
				
				System.out.print((char)data);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}

}
