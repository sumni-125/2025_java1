package day16.io.file문자;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader에이콘학생이름 {

	public static void main(String[] args) {

		// 파일에서 문자 단위로 읽기
		FileReader fis;

		try {
			fis = new FileReader("res/acorn2.txt");
			int data = fis.read();
			System.out.println((char) data);
			
			fis.close();
 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
