package day16.prac.io.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class 파일복사 {

   public static void main(String[] args) {

      
      //이미지 파일 복사하기
      
      //입력스트림 (바이트 기반 스트림)
      //출력스트림 (바이트 기반 스트림)
      
      //FileInputStream
      //FileOutputStream
      
      try(
            FileInputStream f = new FileInputStream("res/구냥이.jpg");
            FileOutputStream o = new FileOutputStream("res/구냥이copy.jpg")) {
         
         
         while(true) {
            int data = f.read();   //파일의 끝이 아스키코드로 마이너스일에 해당되는 거라고..?
            if(data == -1)break;
            
            o.write(data);
         }
         
      } catch (FileNotFoundException e) {
         e.printStackTrace();
      } catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
      

   }

}
