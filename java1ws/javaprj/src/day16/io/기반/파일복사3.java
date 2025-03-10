package day16.io.기반;

import java.io.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class 파일복사3 {
    public static void main(String[] args) {
        String sourceFilePath = "res/cute.jpg"; // 원본 파일 경로
        String targetFilePath = "res/cutecopy2.jpg"; // 복사본 파일 경로
        
        // 절대 경로를 사용할 경우 주석을 해제하여 사용 가능 
        
        // String sourceFilePath = "c:\\acorn\\a.txt"; // 원본 파일 경로
        // String targetFilePath = "c:\\acorn\\복사본파일2.txt"; // 복사본 파일 경로

        
        
        long startTime = System.currentTimeMillis(); // 시작 시간 측정

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

        long endTime = System.currentTimeMillis(); // 종료 시간 측정
        long elapsedTime = endTime - startTime; // 경과 시간 계산

        System.out.println("파일 복사 시간: " + elapsedTime + "밀리초");
    }
}
