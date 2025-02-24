package day07.학생;

import java.util.Scanner;

public class 문제1_김유민 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int result= substract(num1, num2);
		
		System.out.println("두 수의 차이는: "+result+"입니다");

	}
		
	public static int substract(int su1, int su2) {
		
		int result = ((su1>su2)?su1:su2) - ((su1<su2)?su1:su2);
		return result;
	}

}
