package day16.io;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileScanner2 {
    public static void main(String[] args) {
        // 파일 경로 설정
        String filePath = "res/acorn2.txt";

        try {
            // FileInputStream을 사용하여 파일을 열고 Scanner에 전달
            FileInputStream fis = new FileInputStream(filePath);
            Scanner scanner = new Scanner(fis);

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
