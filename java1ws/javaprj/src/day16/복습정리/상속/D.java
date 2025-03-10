package day16.복습정리.상속;

public class D  extends C{

	int x=3;
	int y=4;
	
	void super키워드사용하기() {
		System.out.println( this.x);
		System.out.println( this.y);
		
		System.out.println( super.x);
		System.out.println( super.y);
		
		
	}
	
	
	@Override
	void c매서드() {
		// TODO Auto-generated method stub
		
		
		System.out.println("D매서드");    
	}
	
	
	
	void super로부뫠서드c매서드호출하기() {
		super.c매서드();
	}
}
