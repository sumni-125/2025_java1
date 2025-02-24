package day07.학생;

import java.util.Scanner;

public class 문제2_오윤석 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 수를 입력해주세요:");
		int num1 = sc.nextInt();
		System.out.print("두 번째 수를 입력해주세요");
		int num2 = sc.nextInt();

		subtract(num1, num2);
	}

	public static void subtract(int a, int b) {
		if (a > b) {
			System.out.println("두 수의 차:" + (a - b));
		} else {
			System.out.println("두 수의 차:" + (b - a));
		}
	}

}
