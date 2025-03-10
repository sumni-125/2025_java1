package day16.복습정리.함수매서드;


//함수가 내부에서 자기자신을 호출하는 것을 재귀호출이라고함 . 주의 !!  반드시 종료조건이 있어야 함 
// 1~10까지 합 
// for, 재귀
// recursive call
// call stack
public class 재귀호출 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		재귀호출 o= new  재귀호출();		
		int result = o.sum(10);
		int result2  = o.sumR(10);		
		
		System.out.println(result);
		System.out.println(result2);

	}
	
	
	
	int sum ( int su) {
		int sum=0;
		for( int i=1; i<= su; i++) {
			sum +=i;
		}
		return sum;
	}	
	
	
	
	int sumR ( int su) {	
		if( su<=1) return 1;
		return su +sumR(su-1);
	} 
	

}
