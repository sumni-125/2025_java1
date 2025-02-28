package day11.상속맛보기.상속;

public class Main {

	public static void main(String[] args) {


		Student s  = new Student();
		s.걷기();
		s.말하기();
		s.잠자기();
		s.먹기();		
		s.공부하기();
		
		
		StudentWorker sw = new StudentWorker();
		sw.공부하기();
		sw.걷기();
		sw.말하기();
		sw.먹기();
		sw.일하기();
		sw.잠자기();
		
		
	}

}
