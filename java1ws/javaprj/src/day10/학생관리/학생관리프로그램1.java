package day10.학생관리;

public class 학생관리프로그램1 {

	public static void main(String[] args) {
		
		
		Student[] list = new Student[10];
		
		
		list[0] = new Student("임형택", 100, 99);
		list[1] = new Student("윤현기", 99, 100);
		list[2] = new Student("오윤석", 99, 99);
		list[3] = new Student("이동우", 98, 99);
		list[4] = new Student("권지언", 99, 98);
		list[5] = new Student("홍길동", 60, 59);
		
		
		for(int i=0;i<6;i++) {
			list[i].calc();
		}
		for(int i=0;i<6;i++) {
			System.out.println(list[i].toString());
		}
		
	}

}
