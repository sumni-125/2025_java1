package day09;

public class 학생정보프로그램5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student4 s=new Student4();
		s.input("이정호",100,90);
		s.cal();
		s.printInfo();
		
		Student4 s2 = new Student4();
		s2.input("이수민", 90, 100);
		s2.cal();
		s2.printInfo();
		
		Student4[] list = {s, s2};
		
		for(int i=0; i<list.length;i++) {
			list[i].printInfo();
		}
		
	}

}
