package day16.io.기반;

import java.io.IOException;
import java.io.InputStreamReader;

public class 한바이트계속읽기2 {
    public static void main(String[] args) {
        InputStreamReader is = new InputStreamReader(System.in);

        try {
            int data;            
            // 엔터키 입력 전까지 반복
            while ((data = is.read()) != '\n') {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
