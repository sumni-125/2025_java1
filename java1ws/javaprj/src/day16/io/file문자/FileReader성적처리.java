package day16.io.file문자;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class FileReader성적처리 {
    public static void main(String[] args) {
        try {
            // 파일에서 성적 읽어오기
            BufferedReader reader = new BufferedReader(new FileReader("res/성적파일.txt"));

            String line;
            while ((line = reader.readLine()) != null) {
                // 콤마로 구분된 문자열을 분리하여 이름과 점수를 얻음
                String[] data = line.split(",");
                
                // 첫 번째 요소는 이름, 나머지는 점수
                String name = data[0];
                int koreanScore = Integer.parseInt(data[1]);
                int englishScore = Integer.parseInt(data[2]);
                int mathScore = Integer.parseInt(data[3]);

                // Score 객체 생성
                Score  studentScore = new Score (name, koreanScore, englishScore, mathScore);

                // 결과 출력
                System.out.println("이름: " + studentScore.getName());
                System.out.println("평균 점수: " + studentScore.getAvg());
                System.out.println("학점: " + studentScore.getGrade());
            }

            reader.close();
        } catch (IOException e) {
            System.err.println("파일을 읽는 도중 오류가 발생했습니다: " + e.getMessage());
        }
    }
}
