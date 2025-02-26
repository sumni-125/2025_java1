package day07;

public class callByValue {

	public static void main(String[] args) {
		int num1=3;
		int num2=2;
		
		int result=adder(num1, num2);
		System.out.println(result);
	}
	//call by value => 함수 호출 시 전달되는 값, 데이터값 전달 (내용값)
	//함수 
	//더하는 기능
	//입력 : 정수 2개
	//반환 : 더한 값
	
	public static int adder(int num1, int num2) {
		return num1+num2;
		
	}
}
