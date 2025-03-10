package day16.io.기반;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class 파일복사5 {
    public static void main(String[] args) {
        String sourceFilePath = "res/cute.jpg"; // 원본 파일 경로
        String targetFilePath = "res/복사본파일이미지3.jpg"; // 복사본 파일 경로
        
        
        try (FileInputStream is = new FileInputStream(sourceFilePath);
             FileOutputStream os = new FileOutputStream(targetFilePath)) {

            // 파일 복사
        	
        
          
        	/* 
            byte[] data  =  new byte[1024]; 
            while (true) {
            	
            	int num  = is.read(data);
            	if( num ==-1) break;
                os.write( data , 0, num);
            }
*/
 
        	is.transferTo(os); // java9 버전 이후 부터 
        	
            os.flush();
            os.close();
            is.close();
            
            
            System.out.println("파일 복사가 완료되었습니다.");

        } catch (IOException e) {
            System.err.println("파일 복사 중 오류 발생: " + e.getMessage());
        }

      
    }
}
