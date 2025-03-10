package day16.io.기반;

 

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class 파일복사버퍼2 {

    public static void main(String[] args) {
        
    	  
        long startTime = System.currentTimeMillis(); // 시작 시간 측정
        
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("res/cute.jpg"));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("res/cuteCopy2.jpg"))) {

            byte[] buffer = new byte[1024]; // 1KB 버퍼
            int bytesRead;
            
            // 파일을 읽고 버퍼에 저장한 후, 버퍼 내용을 파일로 씁니다.
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
            
            
            long endTime = System.currentTimeMillis(); // 종료 시간 측정
            long elapsedTime = endTime - startTime; // 경과 시간 계산
            
            
            

            System.out.println("파일 복사 시간: " + elapsedTime + "밀리초");
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
