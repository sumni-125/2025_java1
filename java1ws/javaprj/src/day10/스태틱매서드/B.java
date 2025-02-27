package day10.스태틱매서드;

public class B {
	
	int su1;
	int su2;
	
	
	public B() {
		
	}
	
	public B( int su1, int su2) {
		this.su1 = su1;
		this.su2= su2;
	}
	
	
	// B라는 클래스의 객체가 생성된 후 부터 사용할 수 있다 
	
	public int add() {
		int total  = su1+ su2;
		return total;
	}

}
