package day16.복습정리.상속;

import java.util.ArrayList;

public class ArrayList옛날버전 {

	public static void main(String[] args) {
	 
		
		
		//모든 객체는  Object로 다룰 수 있다.
		//자바의 라이브러리에서  Object type으로 사용하는 경우가 많이 있다.
		ArrayList  list =new ArrayList();
		
		
		list.add(new A());  // 업캐스팅이 일어남
		list.add(new A());
		list.add(new A());
		list.add(new A());
		
		
		
		Object  i = list.get(0);   // 첫번째 객체 얻어오기
		
		//올바르게 사용하기 위해 다운캐스팅 필요함
		
	    ( (A)i).놀기();
		
		

	}

}
