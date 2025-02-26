package day09;

public class 학생정보프로그램3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student2 s= new Student2();//s는 참조형변수이다
		
		s.input("이수민", 100, 99);
		s.calc();
		//s.printInfo();
		
		Student2 s2= new Student2();//s는 참조형변수이다
		
		s2.input("이수만", 55, 65);
		s2.calc();
		//s2.printInfo();
		
		Student2[] list = {s, s2};
		System.out.println("===========배열로 처리하기========");
		for(int i=0;i<list.length;i++) {
			list[i].printInfo();
		}
	}

}
