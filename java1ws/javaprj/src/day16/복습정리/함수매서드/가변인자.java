package day16.복습정리.함수매서드;

public class 가변인자 {
	
	void 가변인자매서드( int...ars) {		
		for( int num : ars) {
			System.out.println( num);
		}
		
	}
	
	
	void 매서드( String ...a) {
		for( String s : a) {
			System.out.println( s);
		}
		
	}
	

	public static void main(String[] args) {
	 
		가변인자 o = new 가변인자();
		o.가변인자매서드(6,7,8);
		o.가변인자매서드(6,7); //넘겨주는값 :인자
		
		o.매서드("one");
		o.매서드("one" ,"two");
		o.매서드("one" ,"two", "three");
		
	}

}
