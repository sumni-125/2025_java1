package day16.복습정리.상속;

public class 상속정의 {

	public static void main(String[] args) {
		
		StringBuilder s  = new StringBuilder(1000);
		
		s.append( "상속 :  (inheritance)");
		s.append( "부모로 부터 모든것을 상속받을 수 있다.");
		s.append( "코드의 집중화, 재사용성으로 유지보수를 좋게 할 수 있다.");
		s.append( "상속을 통해 하위클래스(자식클래스들을)부모형으로 다룰 수 있다.       (상속관계에서 업캐스팅, 다운캐스팅이 발생할 수 있다.    - 다운캐스팅시 문제가 발생되지 않도록 주의한다)   ");    
		s.append( " 다른의미로는 여러 하위클래스를  하나의 type으로 다룰 필요가 있을 때 부모를 만들 수 도 있다.");
		s.append( " (상속 : abstract, interface = > 부모로써만 존재하는 ,  즉 하위클래스를 다룰 목적으로 존재하는 상속이다) ");
		s.append( "   =>추상매서드를 가진 부모로써 new될 수 없다. !!, 자식클래스가 반드시 상속하여 사용해야 한다 ");

		//StringBuilder  -> String으로 변환해 주는 매서드
		System.out.println(  s.toString());  

	}

}
