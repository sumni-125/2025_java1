package day16.io.file바이트;

 

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileEx01 {
    public static void main(String[] args) {
         
    	
    	
    	//  "try-with-resources" 문법은 Java 7 버전부터 지원
    	//   이 문법은 자동으로 리소스를 해제해 주기 때문에, finally 블록에서 수동으로 close() 메서드를 호출할 필요가 없어서 편리하다
    	
    	
        try (FileInputStream fis = new FileInputStream("res/test.txt")) {
            int data1;

            
            data1 = fis.read() ;               
            System.out.print((char) data1); 

            data1 = fis.read() ;               
            System.out.print((char) data1);
              
        } catch (FileNotFoundException e) {
            // 파일이 존재하지 않을 때 처리
            System.err.println("파일을 찾을 수 없습니다: " + e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            // 파일을 읽는 중에 오류가 발생할 때 처리
            System.err.println("파일을 읽는 중 오류 발생: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
