package day11.패키지와import.a;

 import day11.패키지와import.b.Snack;


public class 프로그램작성2 {

	public static void main(String[] args) {
	 
		
	 	Snack s = new Snack("오징어땅콩", 2500);
		//day11.패키지와import.b.Snack  s = new  day11.패키지와import.b.Snack("오징어땅콩" ,2500);
		
		
		System.out.println( s.toString() );
		

	}

}
