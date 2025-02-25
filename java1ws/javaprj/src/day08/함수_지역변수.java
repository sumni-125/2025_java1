package day08;

public class 함수_지역변수 {

	public static void main(String[] args) {
		 
		int sum;
		
		int a=10;
		int b=20;
		
		sum=a+b;
		
		System.out.println(sum);
		System.out.println(adder(a,b));
		
	}
	
	//기능: 두수의 합
	//입력(매개변수): 두 수
	//반환: 합
	
	//지역변수: 함수 안에서 만들어지는 변수
	//지역변수: 함수 호출시에 만들어지고 함수가 반환될 때 모두 정리된다(스택영역에 할당됨)
	//함수 안에서 만든 변수는 그 함수 안에서만 사용가능하다
	
	public static int adder( int a, int b) {
		int sum = a+b;
		return sum;
	}
	
}
