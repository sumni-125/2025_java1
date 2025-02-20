package day05.배열실습_학생;

import java.util.Random;
import java.util.Arrays;

public class Num2_김민환 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] lottoNumbers = new int[6]; 

        System.out.print("예상 로또 번호:");
        
        for (int i = 0; i < 6; i++) { 
        	int num;
            num = random.nextInt(45) + 1;	//범위 설정 1~45
            lottoNumbers[i] = num;	//랜덤으로 생성된 숫자 배열에 저장
            System.out.print(lottoNumbers[i]);
        }
        
    }
    
}
