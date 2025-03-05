package day12.오후실습;

public class Manager extends Employee {
	
	int bonus = 1000000;
	
	public Manager(String name, int time, int rate) {
		super(name, time, rate);
	}
	
	@Override
	public int calcSalary() {
		
		salary = time*rate;
		this.salary = salary+bonus;
		return this.salary;
	}
	
	
}
