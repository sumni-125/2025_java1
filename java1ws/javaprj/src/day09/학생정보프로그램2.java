package day09;

public class 학생정보프로그램2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s= new Student();	//Student type 변수가 만들어짐
		
		input(s);
		
		calc(s);
			
		printInfo(s);
	}
	public static void input(Student s) {
		s.name="이수민";
		s.kor=100;
		s.eng=99;
		
	}
	
	public static void calc(Student s) {
		s.total=s.kor+s.eng;
	}
	
	public static void printInfo(Student s) {
		System.out.println(s.name);
		System.out.println(s.kor);
		System.out.println(s.eng);
		System.out.println(s.total);
	}
}
