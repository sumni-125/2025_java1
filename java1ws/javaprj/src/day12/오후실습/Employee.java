package day12.오후실습;

public class Employee {
	
	protected String name;
	protected int time;
	protected int rate;
	
	int salary=0;
	
	public Employee() {
		
	}
	public Employee(String name, int time, int rate) {
		this.name = name;
		this.time = time;
		this.rate = rate;
	}
	
	public int calcSalary() {
		salary = time*rate;
		return salary;
	}
	
	
	public String toString() {
		calcSalary();
		return name+"님의 급여: "+salary;
	}
	
}
