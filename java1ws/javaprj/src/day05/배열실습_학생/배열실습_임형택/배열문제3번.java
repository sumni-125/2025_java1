package day05.배열실습_학생.배열실습_임형택;

import java.util.Scanner;

public class 배열문제3번 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String [] foods = new String[5];
		
		System.out.println("좋아하는 음식을 입력하세요");
		for(int i=0; i<foods.length; i++) {
			foods[i] = sc.nextLine();
		}
		
		
		System.out.println("좋아하는 음식입니다");
		for(int i=0; i<foods.length; i++) {
			System.out.print(foods[i] + "  ");
		}
		
		
		
		
		
	}

}
