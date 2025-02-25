package day08;

public class 고객정보출력하기 {

	public static void main(String[] args) {
		
		String name="홍길동";
		String address="서울시 노원구";
		int age=25;
		
		printInfo(name, address, age);
		
	}
	
	
	public static void printInfo(String name, String address, int age) {
		System.out.println(name);
		System.out.println(address);
		System.out.println(age);
	}

}
