package day16.prac.io;

import java.io.IOException;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i=1; i<=5;i++) {
			try {
				System.out.print((char)System.in.read());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
