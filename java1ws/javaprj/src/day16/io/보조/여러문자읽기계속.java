package day16.io.보조;

 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 여러문자읽기계속 {

    public static void main(String[] args) {
        // BufferedReader를 사용하여 사용자 입력을 읽어들입니다.
        BufferedReader bs = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            String data;
            
            // "exit"을 입력할 때까지 반복
            while (true) {
                System.out.print("입력하세요 ('exit' 입력 시 종료): ");
                data = bs.readLine();
                
                // "exit" 입력 시 반복 종료
                if (data.equalsIgnoreCase("exit")) {
                    System.out.println("프로그램을 종료합니다.");
                    break;
                }
                
                System.out.println("입력한 데이터: " + data);
            }
            
            bs.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
