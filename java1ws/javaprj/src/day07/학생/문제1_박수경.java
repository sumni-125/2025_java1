package day07.학생;

import java.util.Scanner;

public class 문제1_박수경 {

	public static void main(String[] args) {
		//1. subtract 함수만들어 두 수를 매개변수로 받아  큰 수에서 작은수를 뺀 결과를 반환하는 함수를 만들기
		
		int result=subtract();
		System.out.println(result);
		
	}
	
	 public static int subtract() {
		 Scanner sc=new Scanner(System.in);
		 int num1=sc.nextInt();
		 int num2=sc.nextInt();
		 int result;
		
		 if(num1>=num2) {//먼저 입력한 수가 큰 수인 경우
			 result=num1-num2;
		 }else{			//먼저 입력한 수가 작은 수인 경우
			 result=num2-num1;
		 }
		 
		 return result;
	 }
}
