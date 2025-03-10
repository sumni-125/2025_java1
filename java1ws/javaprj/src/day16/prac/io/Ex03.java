package day16.prac.io;

import java.io.IOException;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while(true) {
			
			try {
				int data = System.in.read();
				
				if(data =='\n') break;
					
				System.out.print((char)data);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		}
		
		
	}

}
