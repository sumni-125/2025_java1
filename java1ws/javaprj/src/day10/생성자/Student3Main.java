package day10.생성자;

public class Student3Main {

	public static void main(String[] args) {
		 
		
		Student3  s= new Student3( "홍길동" , 25);
		
		
		s.printInfo();
		
		
		String result  =s.toString();		
		System.out.println( result );
		
		
		
		String name  =s.getName();
		System.out.println( name);
		
		int age  = s.getAge();
		System.out.println( age);
		
		
		
		s.setAge(35);
		s.setName("홍길동님");
		
		
		s.printInfo();
	}

}
