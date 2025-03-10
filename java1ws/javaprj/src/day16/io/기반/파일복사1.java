package day16.io.기반;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class 파일복사1 {
	
	
    public static void main(String[] args) {
    	
        String sourceFilePath = "res/cute.jpg"; // 원본 파일 경로
        String targetFilePath = "res/copycute.jpg"; // 복사본 파일 경로
        
        
        try (FileInputStream inputStream = new FileInputStream(sourceFilePath);
             FileOutputStream outputStream = new FileOutputStream(targetFilePath)) {

            // 파일 복사
            int data;
            while ((data = inputStream.read()) != -1) {
                outputStream.write(data);
            }

            System.out.println("파일 복사가 완료되었습니다.");

        } catch (IOException e) {
            System.err.println("파일 복사 중 오류 발생: " + e.getMessage());
        }

      
    }
}
