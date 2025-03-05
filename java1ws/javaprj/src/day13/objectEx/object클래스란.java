package day13.objectEx;

public class object클래스란 {

	public static void main(String[] args) {
	
		
		//모든클래스(개발자, 라이브러리)는 Object 클래스를 상속받게 되어있다
		//최상위 부모 역할을 함
		//모든 객체는 Object로 다뤄질 수 있다
		
		
		A a = new A("A객체");
		a.printInfo();
		System.out.println(a.toString());
		System.out.println(a);	// a.toString();	//toString()메서드는 생략된 형태로 사용할 수 있다
	
	
		B b = new B();
		Score s = new Score(90,100);
		
		Object[] list = new Object[3];
		list[0] = a;
		list[1] = b;
		list[2] = s;
		
		System.out.println("=============");
		for(int i=0; i<list.length; i++) {
			
			System.out.println(list[i]);	// list[i].toString();
		}
	
	}

}
