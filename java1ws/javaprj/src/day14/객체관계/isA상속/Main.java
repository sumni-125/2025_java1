package day14.객체관계.isA상속;

public class Main {

	public static void main(String[] args) {
		
		B b = new B();		//Object
							//	A
							//	B
		
		
		A a = b; //업캐스팅 	(인스턴스를 A만큼만 해석)
		
		Object o = b;	//업캐스팅가능	(object 만큼만 해석)
		
		//필요하면 다운캐스팅
		
		((B)o).B메서드();
		
	}

}
