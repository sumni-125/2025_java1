package day16.prac.io.file;

import java.io.FileWriter;
import java.io.IOException;

public class Ex11 {

	public static void main(String[] args) {
		
		
		//문자 출력 기반스트림 사용
		
		
		 try(FileWriter w = new FileWriter("res/ouput.txt")) {
	         w.write("안녕하세요?");
	         w.write("파일이 생겼어요");
	         w.flush();
	      } catch (IOException e) {
	         e.printStackTrace();
	      }
		
		
		
		
		
	}

}
