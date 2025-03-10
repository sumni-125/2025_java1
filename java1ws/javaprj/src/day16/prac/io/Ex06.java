package day16.prac.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex06 {

	public static void main(String[] args) {
		// 
		
		//System.in	(기반)
		//InputStreamReader	(보조) 
		//BufferedReader	(보조)
		
		BufferedReader bs = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String data = bs.readLine();
			System.out.println(data);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
