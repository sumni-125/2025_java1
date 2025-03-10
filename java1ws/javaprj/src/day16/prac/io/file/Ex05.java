package day16.prac.io.file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//파일 문자기반 스트림
		
		try (FileReader fir = new FileReader("res/names.txt")){
			int data = fir.read();
			System.out.println((char)data);
			
			data = fir.read();
			System.out.println((char)data);
			
			data = fir.read();
			System.out.println((char)data);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
	}

}
