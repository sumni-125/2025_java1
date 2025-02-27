package day10.객체배열;

public class 객체배열 {

	public static void main(String[] args) {
		
		
		Customer c  = new Customer("아이유",31);
		
		//c : customer 객체라고 함 
		//c : 참조형변수 (주소를 기억하는 변수)
		// new  : 메모리공간 할당 , 메모리의 주소를 반환함 
		//참조형변수의 기본값  :  null   ( 
		
		
		
		Customer c2 = new Customer("박보검" , 34);
		Customer c3 = new Customer("이준혁",42);
		
		
		
		
		// 객체배열선언 		
		// 주의사항 !! : 객체배열은 선언하면 객체가 3개 만들어진것이 아니다 
		// 3개 객체의 주소를 저장할 수 있는 참조형변수가 배열로 만들어진것이다 
		// 참조형변수가 배열로 만들어지면 기본값으로 초기화가 된다 ( 배열의 요소가 모두  null이다)
		
		Customer[] list = new Customer[3];	  // c, c2 , c3  변수 3개를 연속적으로 확보한 배열이 만들어진다	
		//list[0].printInfo();
		 
		
		//객체를 생성하고 참조형변수 (배열의 요소)에 저장한 다음 사용해야 한다 
		list[0] = new Customer("아이유",31);
		list[1]= new Customer("박보검",34);
		list[2] = new Customer("이준혁",42);
		 
		
		list[0].printInfo();
		list[1].printInfo();
		list[2].printInfo();
		
		
		
		System.out.println( "반복문");
		for( int i=0 ; i< list.length; i++) {
			Customer item  = list[i];
			item.printInfo();
		}
		
		
		for( Customer  item : list) {			 
			item.printInfo();			
		}
		
		
		
		
		
		

	}

}
