package day07.practice;

import java.util.Scanner;

public class 함수실습_황예지 {

	public static void main(String[] args) {
		
		//숫자 입력받아서 약수와 약수개수 구하는 함수
		
		//입력O
		//반환X
		
		약수구하기(12);
		약수구하기(144);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		
		약수구하기(num);
		
	}

	public static void 약수구하기(int num) {
		int cnt=0;
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				System.out.print(i+" ");
				cnt++;
			}
		}
		System.out.println("");
		System.out.println("약수의 개수: "+cnt+"개");
	}
}
