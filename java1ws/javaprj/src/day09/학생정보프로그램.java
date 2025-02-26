package day09;

public class 학생정보프로그램 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s= new Student();	//Student type 변수가 만들어짐
		
		s.name="이수민";
		s.kor=100;
		s.eng=99;
		
		s.total=s.kor+s.eng;
		
		System.out.println(s.name);
		System.out.println(s.kor);
		System.out.println(s.eng);
		System.out.println(s.total);
	}

}
