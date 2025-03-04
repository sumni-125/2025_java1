package day11.변수종류_초기화;

class Product{
	private  String name;
	//private  int price ;   // 기본값으로 초기화 
	private  int price=100 ;   // 명시적초기화
	//생성자 
	
	private  static int cnt=0; 
	
	
	//인스턴스 초기화 블럭 
	{
		
		cnt++;
		System.out.println( "초기화 블럭 실행됨");
	}
	
	
	public Product() {
		//cnt++;
		
	}
	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
		
		//cnt++;
	}
	
	
	//매서드(함수)
	//인스턴스변수의 값을 얻어오는 방법
	public String toString() {
		return name +price;
	}
	
	// getter: 각 각의 속성 값을 제공하는 방법
	// setter : 각 각의 속성 값을 변경하는 방법 
	
	
	
	public static void printCnt() {
		System.out.println( cnt);
	}
}



public class 인스턴스변수초기화 {

	public static void main(String[] args) {
		
		/*
		 * 인스터변수 초기화방법과 순서
		   1. 기본값으로 초기화   int age ;  ( int =>0  ,  double =>0.0 , String => null , 객체는 모두  => null)  
		   2. 명시적으로 초기화   int age=20;
		   3. 초기화블럭    { }  :  복잡한 초기화코드 
		                         모든 생성자에서 모두 작성해야하는 코드가 있다면
		                         초기화 블럭을 사용할 수 있음
		   4. 생성자 
		      : 매개변수가 다양한 생성자를 만들 수 있다 (생성자 오버로딩)		   
		 
		 */
		
		
		Product p  = new Product("샤넬백" , 12000000);
		Product p2 = new Product("구찌백" , 4000000);
		
		
		System.out.println( p.toString());
		System.out.println( p2.toString()); 
		
		Product p3 = new Product();
		
		System.out.println( p3); 
		
		
		Product.printCnt();
	 
	}

}
