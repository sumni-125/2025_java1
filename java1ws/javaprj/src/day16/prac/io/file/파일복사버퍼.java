package day16.prac.io.file;

import java.io.*;

import java.io.*;

public class 파일복사버퍼 {
    public static void main(String[] args) {
    	 String sourceFilePath = "res/img.jpg"; // 원본 파일 경로
         String targetFilePath = "res/imgcopy3.jpg"; // 복사본 파일 경로
         
        
        //성능을 위해서 보조스트림을 사용할 수 있다  
        
        long startTime = System.currentTimeMillis(); // 시작 시간 측정

        try (
            BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(sourceFilePath));
            BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(targetFilePath))
        ) {
            int data;

            while ((data = inputStream.read()) != -1) {
                outputStream.write(data);
            }

            System.out.println("파일 복사가 완료되었습니다.");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis(); // 종료 시간 측정
        long elapsedTime = endTime - startTime; // 경과 시간 계산
        
        
        

        System.out.println("파일 복사 시간: " + elapsedTime + "밀리초");
    }
}
