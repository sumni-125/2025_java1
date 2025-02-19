package day03;

public class 리터럴 {

	public static void main(String[] args) {
		//프로그램에서 값 자체 => 리터럴이라고 함
		//상수라고도 함
		
		//리터럴도 저장된 후 사용된다
		//리터럴도 크기를 가진다
		
		//정수형 리터럴 => int 크기로 저장된다
		//실수형 리터럴 => double 크기로 저장된다
		
		//
		
		//long l =2200000000;
		
		//1. 22억이 상수영역에 저장된다 .int크기로 ( 상수영역에 int크기로 저장되는 것에 문제 발생)
		//2. l long형 변수에 값이 저장된다.
		
		
		//long형 리터럴은 값 뒤에 l, L 붙여야함
		
		long l =2200000000l;
		
		System.out.println(l);
		
		//float f=35.4;
		//1. 35.4가 상수영역에 저장되는 것은 문제가 발생하지 않는다.
		//2. double형 데이터 => float형 변수에 저장되는 문제발생 (데이터 손실
		
		float f = 35.4f;
		
		//float형 리터럴로 저장하고 싶다면 값뒤에 f, F 붙여야함
		
		
		
		
		
		
	}

}
