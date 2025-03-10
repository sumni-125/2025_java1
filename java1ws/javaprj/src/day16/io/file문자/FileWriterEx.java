package day16.io.file문자;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {

	public static void main(String[] args) {
	 
		try {
			//기반스트림 얻어오기
			//파일 문자기반 쓰기
			
			FileWriter w = new FileWriter("res/output3.txt");
			w.write("안녕하세요");
			w.write( "파일쓰기가 되어요 !");	
			w.flush();
			
 			w.close();
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
