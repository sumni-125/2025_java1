package day07.학생;

import java.util.Scanner;

public class 문제0_임형택 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력하시오");
		int z = sc.nextInt();
		System.out.println("두번째 숫자를 입력하시오");
		int x = sc.nextInt();
		
		int result = 합반환(z,x);
		
		System.out.println("두 수의 합은 : "+result);
		
	}

	
	public static int 합반환 (int a, int b) {
		int result = a+b;
		return result;
	}
}
