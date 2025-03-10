package day16.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileScanner {
    public static void main(String[] args) {
        // 파일 경로 설정
        String filePath = "res/acorn2.txt";

        try {
            // Scanner를 사용하여 파일에 직접 연결
            Scanner scanner = new Scanner(new File(filePath));

            // 파일 내용 읽기 및 출력
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

            // Scanner 닫기
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("파일을 찾을 수 없습니다: " + filePath);
            e.printStackTrace();
        }
    }
}
