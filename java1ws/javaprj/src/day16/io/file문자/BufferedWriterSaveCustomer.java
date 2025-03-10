package day16.io.file문자;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class BufferedWriterSaveCustomer {
    public static void main(String[] args) {
        ArrayList<Customer> studentScores = new ArrayList<>();

        // 학생 정보 10개 추가
        studentScores.add(new Customer("김길동",  24));
        studentScores.add(new Customer("박길동", 32));
        studentScores.add(new Customer("최길동", 25));
        studentScores.add(new Customer("홍길동", 29));
    

        // 파일에 저장할 경로
        String filePath = "res/customerList.txt";

        // 학생 정보를 파일에 저장
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Customer score : studentScores) {
                writer.write(score.toString());
                writer.newLine(); // 줄바꿈 추가
            }
            System.out.println("학생 정보가 파일에 성공적으로 저장되었습니다.");
        } catch (IOException e) {
            System.err.println("파일 저장 중 오류 발생: " + e.getMessage());
        }
    }
}
