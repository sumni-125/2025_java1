package day16.io.보조;
 

import java.io.IOException;
import java.io.InputStreamReader;

public class 한문자읽기계속 {

    public static void main(String[] args) {

        // 보조스트림은 기반스트림 정보를 받아야 사용할 수 있다.
        // 보조스트림은 실제적인 데이터의 읽기와 쓰기가 불가능하다. 
        // 보조역할을 한다.

        InputStreamReader is = new InputStreamReader(System.in); 
        
        try {
            int data;
            
            // 한 문자를 계속해서 읽는다 .
            //엔터 입력 시 종료.
            while ((data = is.read()) != '\n') {  // 엔터 키는 \n으로 인식됨
                System.out.println((char) data); // 문자로 출력
            }
            System.out.println("프로그램 종료.");
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
