package day11.패키지와import.b;

public class 프로그램 {

	public static void main(String[] args) {
		
		/*
		 * public class Snack {
		 * String name;	//default: 같은 패키지에서는 접근을 허용함
		 * int price;
		 * */
		
		
		
		Snack s = new Snack("새우깡", 1200);
		
		s.name="";//접근가능함, 스낵과 프로그램 클래스가 같은 패키지에 있으므로 접근이 가능하다
		s.price=0;//접근가능
		
		
		/*
		 public class Snack {
			private String name;	//default: 같은 패키지에서는 접근을 허용함
			private int price;
			
		 Snack s = new Snack("새우깡", 1200);
		 
		 s.name="";//접근이 불가능 ( private은 내 클래스 내부에서 접근이 가능하다)
		 s.price=0;//접근이 불가능
		 
		 */
		
	}

}
