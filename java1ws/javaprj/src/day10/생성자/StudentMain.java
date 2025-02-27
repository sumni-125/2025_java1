package day10.생성자;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Student s  = new Student();
		s.input("홍길동", 25);
		s.printInfo();
		
		s.input("홍길동", 35);
		s.printInfo();
		
		//s.name="홍길동님";
		s.printInfo();
	}

}
