package day08;

public class 고객정보출력하기2 {

	public static void main(String[] args) {
		
		String name="홍길동";
		String address="서울시 노원구";
		int age=25;
		
		 //Cusromer 자료형으로 변수 만들기
		Customer c= new Customer();
		
		c.name="홍길동";
		c.address="서울시노원구";
		c.age=25;
		
		System.out.println(c.name);
		System.out.println(c.address);
		System.out.println(c.age);
	}
	
	
	public static void printInfo(String name, String address, int age) {
		 
	}

}
