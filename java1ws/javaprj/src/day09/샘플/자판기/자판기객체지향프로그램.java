package day09.샘플.자판기;

public class 자판기객체지향프로그램 { 
	
	
	public static void main(String[] args){				
		자판기 자판기객체 = new 자판기();
		
		
		
		자판기객체.printInfo();
		자판기객체.fillCoffee();
		자판기객체.밀크커피만들기( 100);
		자판기객체.밀크커피만들기( 100);			
		자판기객체.printInfo();		
		자판기객체.fillCoffee();		
		자판기객체.밀크커피만들기( 100);
		자판기객체.printInfo();
		
		
	}
}