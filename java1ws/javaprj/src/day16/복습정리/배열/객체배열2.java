package day16.복습정리.배열;

import java.util.ArrayList;

public class 객체배열2 {

	public static void main(String[] args) {
		  
		
		//가변배열 , 배열 + 기능 => 클래스 
		//순서보장 , 중복허용
		
		ArrayList<Score> list  = new ArrayList<>();

		list.add( new Score("장주원" , 100, 100));
		list.add( new Score("이미현" , 99, 80));
		list.add(new Score("김두식" , 80, 70));		
		 
		
		//향상된 for문
		for( Score s : list) {			
			System.out.println(s);
		}
		
		
		//list.size사용하여 출력하기 
		
		for( int i=0; i< list.size() ; i++) {
			Score score = list.get(i);
			System.out.println( score);
		}
		
		
		

	}

}
