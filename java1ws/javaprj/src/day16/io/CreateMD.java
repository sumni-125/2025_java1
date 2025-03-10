package day16.io;
import java.io.File;

public class CreateMD {
    public static void main(String[] args) {
        String directoryPath = "C:\\acorn\\aa\\"; //  window기준  \\ (역슬러쉬 2번) 생성할 폴더 경로

        // 폴더 생성
        File directory = new File(directoryPath);
        if (!directory.exists()) {
            boolean result = directory.mkdirs(); // 폴더 생성 시도
            if (result) {
                System.out.println("폴더가 생성되었습니다.");
            } else {
                System.out.println("폴더 생성에 실패했습니다.");
            }
        } else {
            System.out.println("이미 폴더가 존재합니다.");
        }        
        
    }
}
