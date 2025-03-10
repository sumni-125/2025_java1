package day16.io.객체읽기쓰기;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class 실습4 {

    public static void main(String[] args) {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("res/학생.txt"))) {
            
            while (true) {  // 더 읽을 내용이 없으면 EOFException 발생
                try {
                    Object o = ois.readObject();
                    Score s = (Score) o;
                    System.out.println(s.getName());
                } catch (EOFException e) {
                    System.out.println("다 읽었음");
                    break;  // EOFException 발생 시 종료
                }
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("프로그램 정상 종료");
    }
}
