package day07.학생;

public class 문제_01_이동우 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int result = subtract(80, 40);
		
		System.out.println(result);
	}
	
	public static int subtract(int a, int b) {
				
		//두 수를 비교
		//큰 수 - 작은 수
		
		//a > b
		//b < a
		int minus = 0;
		
		if(a > b) {
			minus = a - b;
		}else if(b > a) {
			minus = b-a;
		}
			
		
		return minus;
		
	}

}
