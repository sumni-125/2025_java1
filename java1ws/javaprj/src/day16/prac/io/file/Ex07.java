package day16.prac.io.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex07 {

	public static void main(String[] args) {
		
		try (BufferedReader br = new BufferedReader(new FileReader("res/acorns.txt"))){
			
			while(true) {
				String name = br.readLine();
				if(name == null) break;///읽은 문자열이 null이면 다 읽었음을 의미함

				System.out.println(name);
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		
	}

}
