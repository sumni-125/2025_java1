package day05.배열실습_학생;

import java.util.Scanner;

public class Num3_김민환 {

	public static void main(String[] args) {
		// 1차원 배열 사용하기 - 좋아하는 음식  5개 저장하고 출력하기
		
		Scanner sc = new Scanner(System.in);

		String[] foods = new String[5];
	
		System.out.println("좋아하는음식 5가지를 입력하세요");
		
		for (int i = 0; i < 5; i++) {
            foods[i] = sc.nextLine();
        }
		System.out.print("음식 목록:"+foods[0]+","+foods[1]+","+foods[2]+","+foods[3]+","+foods[4]);
		
		sc.close(); 
	}

}
