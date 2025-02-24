package day07.함수문제;

import java.util.Arrays;
import java.util.Scanner;

public class 함수문제5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수를 입력하세요: ");
		int num= sc.nextInt();
		
		int[] divisors = divisor(num);
		System.out.println(Arrays.toString(divisors));
		
	}
	public static int[] divisor(int num) {
		int[] divisors = new int[num];
		int index=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				divisors[index]=i;
				index++;
			}
		}
		
		return divisors;
	}
}
