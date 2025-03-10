package day16.복습정리.상속;

public class ObjectEquals매서드재정의 {

	public static void main(String[] args) {
	 
		
		
		Customer c = new Customer( "admin01" ,  1234);
		Customer c2 = new Customer( "admin01" , 1234);	
		
		
		// 두 객체가 같으냐?				
		//참조값을 비교
		if( c==c2) {
			System.out.println("객체의 주소가 같다");			
		}
		
		if(c.equals(c2)) {
			//object에 있는 equals는 객체의 주소를 비교하는 코드로 작성되어 있다.
			System.out.println("객체의 주소가 같다");
		}
		
		
		//두개의 객체의 내용이 같은지 하고 싶다면  equals오버라이드 한 후 사용하자 !!
		//두객체의 같은지에 대한 것은 비지니스에 따라 결정하면 된다.
		
		Customer2 c3 = new Customer2( "admin01" ,  1234);
		Customer2 c4 = new Customer2( "admin01" ,  1234); 
		
		 
		if( c3.equals(c4)) {
			System.out.println("내용이 같다");
		}
		

	}

}
