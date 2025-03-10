package day16.복습정리.캡슐화;

public class 캡슐화정리 {

	public static void main(String[] args) {
		StringBuilder s = new StringBuilder(); 
		
		s.append("캡슐화  (encapsulation)") ;		 
		s.append("   : 데이터와 데이터를 다루는 매서드(기능)가 하나로 묶여있음 ") ;
		s.append("    생성된 객체를 통해서 매서드를 호출할 때 객체의 정보가 전달된다=> this자기참조형변수  ");
		s.append("    생성자, 접근제어자를 통해서 단단한 캡슐을 보장함");
		s.append("   데이터보호를 얻음 ( 특정변수(객체)의 값을 정해진 방법으로만 다룰 수 있게 하겠다) ");
		
		
		
		System.out.println( s.toString());


	}

}
