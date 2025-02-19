package day03;

import java.util.Scanner;

public class 제어문_반복문_while2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1~10까지 합
		//특정 조건으로 반복할 때
		
		//0이 입력되면 반복이 종료되도록 한다
		//0이 입력될 때 까지 수를 더해서 출력하시오
		
		//입력: 입력되는수input
		//출력: 수의 합계: sum
		
		int input;
		int sum=0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			input = sc.nextInt();
			if(input==0) {
				break;
			}
			sum=sum+input;
			
		}
		
		System.out.println(sum);
		
		
		
	}

}
