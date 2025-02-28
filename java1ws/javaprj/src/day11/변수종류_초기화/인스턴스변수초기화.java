package day11.변수종류_초기화;

class Product{
	private String name;
	//int price; //기본값으로 초기화
	int price=100; //명시적으로 초기화
	
	private static int cnt=0;
	
	//인스턴스 초기화 블럭
	{
		cnt++;	
		//생성자보다 먼저 돌아감(생성자마다 .. 돌아가야하는?것? 쓸때??)
		
		System.out.println("초기화블럭 실행됨");
	}
	
	//생성자
	public Product() {
		//cnt++;
	}
	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
		
		//cnt++;
	}
	
	//매서드(함수)
	//인스턴스 변수의 값을 얻어오는 방법 제공
	public String toString() {
		return name+price;
	}
	
	//getter: 각각의 속성 값을 제공하는 방법
	//setter: 각각의 속성 값을 변경하는 방법
	
	public static void printCnt() {
		System.out.println(cnt);
	}
}


public class 인스턴스변수초기화 {

	public static void main(String[] args) {
		/*
			인스턴스변수 초기화방법과 순서
			
			1. 기본값으로 초기화	int age; ( int => 0, double = 0.0 String => null, 객체는 모두 => null)
			2. 임시적으로 초기화	int age=20;
			3. 초기화블럭	{ }
			4. 생성자
			
		*/
		
		Product p1 = new Product("샤넬백",12000000);
		Product p2 = new Product("구찌백",4000000);
		Product p3 = new Product();
		System.out.println(p3.price);
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
		Product.printCnt();
		
	}

}
