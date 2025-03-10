package day16.복습정리.함수매서드;

public class 오버로딩 {

	// 클래스내에서 같은이름의 매서드, 각기 다른 매서드 이지만 이름이 같다
	// 단 두 개의 구별을위해 매개변수의 정보를 다르게 해야 한다, Type, 개수
	// 반환type은 전혀상관없다는 것 !! 
	
	public int 두배만들기(int  amount) {   
		return amount*2;               
	}    
	
	public double 두배만들기(double  amount) {   
		return amount*2;                
	}                                   
	  
	public float  두배만들기( float amoumt) {
		return  amoumt*2.0f;   // double    -> float 
	}
	 
	public static void main(String[] args) {
	 
		
		오버로딩   o  = new 오버로딩();
		int result  =o.두배만들기(5000);
		System.out.println( result);
		
		
		double result2  =o.두배만들기(5000.94345);
		System.out.println( result2);
		
		
		
		float result3 = o.두배만들기(5000.56565f);
		System.out.println( result3);
		
		
		//System.out.println 도 오버로딩된 매서드이다, 같은이름 9개 정도 있다. 
	}

}
