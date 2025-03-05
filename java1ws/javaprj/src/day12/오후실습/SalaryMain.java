package day12.오후실습;

public class SalaryMain {

	public static void main(String[] args) {
		
		Employee e = new Employee("홍길동", 8, 10000);
		Manager m = new Manager("홍길순", 8, 15000);
		
		System.out.println(e.toString());
		System.out.println(m.toString());
		
	}

}
