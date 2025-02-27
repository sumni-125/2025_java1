package day10.스태틱매서드;

import java.util.Random;

public class Random사용하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// static이 있는 매서드와 없는 매서드의 사용법을 알 수 있다 !!! 
		
		
		//라이브러리에서 
		//매서드앞에 static이 있으면 객체생성없이 사용한다 
		int result  =Math.min(3,5 );
		
		
		
		double  result2 = Math.random();
		System.out.println(  result2);
		
		
		
		// Random클래스의 nextInt​(int bound) 사용하기 
		
		Random r  = new Random();		
		int result3  =r.nextInt(10);
		
		System.out.println( result3);
		
		
		

	}

}
