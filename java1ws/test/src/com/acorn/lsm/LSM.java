package com.acorn.lsm;

/*
라이브러리로 만드는 방법

1. 컴파일을 한다 .class파일이 만들어진다
2. 클래스파일을 알집으로 압축한다 .zip파일 생성
3. 확장자 .zip => .jar로 바꾼다

*/

public class LSM {

	//더하기 기능
	//
	public static int adder(int  n1, int n2) {
		return n1+n2;
	}
	
	
	//빼기 기능
	public static int substract(int n1, int n2) {
		int result = n1-n2;
		return result;
	}
	
	public static int multiply(int n1, int n2) {
		return n1*n2;
	}
	
	public static double division(double n1, double n2) {
		return n1/n2;
	}
	
	public static void printStar(int a) {
		for(int i=0;i<a;i++) {
			if(i%5==0) {
				System.out.println();
			}
			if(i%2==0) {
				System.out.print("★");
			}else {
				System.out.print("☆");
			}
			
		}
	}
		
}
