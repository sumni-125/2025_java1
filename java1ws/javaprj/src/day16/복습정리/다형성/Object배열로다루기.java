package day16.복습정리.다형성;


import java.util.ArrayList;

public class Object배열로다루기 {

	public static void main(String[] args) {
		 
		//A, B는  Object형으로 다룰 수 있다. 이유  Object상속 받았기 땨문이다
		Object[] arr  = new Object[2];		
		
		arr[0] = new A();
		arr[1] = new B();
		
	
		
		
		//ArrayList라는 라이브러리가 있다. 객체배열을 쉽게 사용할 수 있도록 지원하는 클래스이다.
		//ArrayList를 가변배열이라고도 한다.
		//ArrayList를 만든 사람은 어떤 Type의 배열을 만들어야 하는가? 특정 클래스 만을 위한 것이 아니라 모든 클래스의 객체를 저장하 수 있도록 Object를 사용한다. 1!!
		// 자바으 라이브러리를 사용하기 위해서는 업캐스팅 다운캐스팅에 대한 의미를 알고 있어야 하고 필요한 순간 업캐스팅과 다운캐스팅을 할 수 있어야 한다
		
		
		ArrayList  list  = new ArrayList();		
		list.add( new A());
		list.add( new B());
		
		
		for( Object o  : list) {
			System.out.println(  o);
			
			//Atype의 객체인 경우 놀기 매서드를 호출해야 한다면  다운캐스팅이 필요함
			
			if( o instanceof A) {
				((A)o).놀기();
			}		
			
		}
		

	}

}
