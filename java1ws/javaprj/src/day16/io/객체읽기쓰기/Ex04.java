package day16.io.객체읽기쓰기;

import java.io.*;


public class Ex04 {
    public static void main(String[] args) {
        // 객체를 파일에 쓰기
        writeObjectToFile();
        // 파일에서 객체 읽기
        readObjectFromFile();
    }

    private static void writeObjectToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("res/studentss.dat"))) {
            // 객체 생성 및 파일에 쓰기
            Score2 student1 = new Score2("스티브잡스", 85, 90, 78);
            Score2 student2 = new Score2("빌게이츠", 92, 88, 95);

            oos.writeObject(student1);
            oos.writeObject(student2);
            
            oos.close();

            System.out.println("데이터를 파일에 성공적으로 쓰기 완료!");
        } catch (IOException e) {
            System.err.println("파일에 쓰기 중 오류 발생: " + e.getMessage());
        }
    }

    private static void readObjectFromFile() {
        try {
            // 파일에서 객체 읽기
        	  ObjectInputStream ois = new ObjectInputStream(new FileInputStream("res/studentss.dat")) ;
            while (true) {
                try {
                    Score2 student = (Score2) ois.readObject();
                    // 읽어온 객체로부터 데이터 처리
                    System.out.println("이름: " + student.getName());
                    System.out.println("평균 점수: " + student.getAvg());
                    System.out.println("학점: " + student.getGrade());
                    System.out.println("--------------------");
                } catch (EOFException e) {
                    // 파일의 끝에 도달하면 예외 발생, 반복문 종료
                    break;
                }
            }
            
            
            ois.close();
            
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("파일에서 읽기 중 오류 발생: " + e.getMessage());
        }
    }
}
