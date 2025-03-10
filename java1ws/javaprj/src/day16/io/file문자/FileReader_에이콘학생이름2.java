package day16.io.file문자;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_에이콘학생이름2 {

	
	//FileReader  :기반스트림 
	
	public static void main(String[] args) {		
		try {
			BufferedReader bf = new BufferedReader( new FileReader("res/acorn.txt"));			
			while(true) {
				String data = bf.readLine();
				if( data == null)break;
				System.out.println( data);
			}			
			
			bf.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
		
	}

}
