package day16.io.file문자;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class 실습1 {

	public static void main(String[] args) {
		 
		
		
		//FileReader 
		
		
		try {
			BufferedReader br  = new  BufferedReader ( new FileReader("res/fruit.txt")) ;
			
			/*
			String result  = br.readLine();
			System.out.println( result);
			
			
			  result  = br.readLine();
			System.out.println( result);
			
			*/
			
			
			while( true) {
				String result  = br.readLine();
				if( result  == null) break;
				
				System.out.println( result);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
