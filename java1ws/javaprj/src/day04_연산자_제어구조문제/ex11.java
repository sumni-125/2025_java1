package day04_연산자_제어구조문제;

import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		
		
		// 10.    2단 출력
		for(int i=1;i<=9;i++) {
			System.out.println("2 * "+i+" = " +2*i);
		}
		
		// 11.     구구단 출력   , 
		for(int i=1;i<10;i++) {
			for(int j=1;j<10;j++) {
				System.out.println(i+" * "+j+" = " +j*i);
			}
		}
		//원하는단 출력 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("출력하고 싶은 구구단을 입력하세요");
		int gugu=sc.nextInt();
		for(int i=1;i<=9;i++) {
			System.out.println(gugu+" * "+i+" = " +gugu*i);
		}
	}

}
