package day13.wrapperEx;

import java.util.ArrayList;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 자바는 객체지향언어이다
		 * Wrapper 클래스
		 * 기본자료형 -> 객체로 다룰 필요가 있다
		 * 기본자료형을 객체로 만들어주는 Wrapper 클래스가 있음
		 * 
		 * 원시자료형은 자료형에 맞는 각 각의 wrapper 클래스
		 * //int  => Integer   ( 혼용해서 사용해도 괜찮다 ) 
		 * //char  => Character
		 * //boolean   => Boolean 
		 * //double  => Double
		 */
		
		ArrayList list = new ArrayList();
		list.add(5);//오토박싱
		
		System.out.println(list.get(0));
		
		Integer a = 10;//숫자를 Integer객체로 생성하는 코드
		Integer b =new Integer(20);
		Integer c = Integer.valueOf(30);
		
		int total;
		total = b+c;//오토언박싱
		System.out.println(total);
		
		
		int total2;
		total2 = b.intValue()+c.intValue();
		
		System.out.println(total2);
		
	}

}
