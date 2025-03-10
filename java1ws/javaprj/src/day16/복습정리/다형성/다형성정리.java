package day16.복습정리.다형성;


public class 다형성정리 {

	public static void main(String[] args) {
		
		
		//문자열을 수정하고 추가할 때는  StringBuilder 사용 
		//버퍼를 크게 만들고 사용해야 성능이 좋아짐
	 
		
		StringBuilder s = new StringBuilder(1000);
		

		s.append( " 다형성 (polymorphisim) ");
		s.append( "상속관계에서 \n ");
		s.append( "부모형참조 변수로 하위객체를 참조하면서 발생할 수 있다.(업캐스팅)\n ");
		s.append( "하나의 메시지 ( 동일한 호출방법)으로 여러 하위객체를 다룰 수 있다. \n");
		s.append( " 하위객체는 각자의 동작방식으로 실행되게 하는 기술이다.\n");

		s.append( "\n---- 선행조건---\n");
		s.append( "상속관계");
		s.append( "부모의 매서드를 자식이 재정의 override 해야 한다.\n");

		s.append( "- 다형성의 예시 !!! (polymorphisim) \n");

		s.append( "동물 (짖다)  \n");
		s.append( " -강아지  (멍멍~) \n");
		s.append( " -야옹이  (야옹~) \n");
		s.append( " -늑대   (아우~) \n");


		s.append( "에이콘학생 (음료마시기)\n");
		s.append( " -에이콘학생을 상속받아 음료마시기를 재정의하여 각 학생은 자신이 좋아하는 방식으로 음료를 마시게 한다\n ");

		
		
		System.out.println(s.toString());

	}

}
