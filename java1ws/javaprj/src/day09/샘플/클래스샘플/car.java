package day09.샘플.클래스샘플;

public class car {
	
	//속성
	private String name;
	private String company;
	private int year;
	private String color;
	private int oil;
	private int speed;
	
	//기능
	
	//입력
	public car() {
		
	}
	
	public void input(String name, String company, int year, String color, int oil) {
		this.name = name;
		this.company = company;
		this.year = year;
		this.color = color;
		this.oil = oil;
	}
	
	//출력
	public void print() {
		System.out.println(name);
		System.out.println(company);
		System.out.println(year);
		System.out.println(color);
		System.out.println(oil);
		System.out.println("=================");
	}
	
	public void start() {
		System.out.println("시동이 걸렸습니다 현재 주행 가능 거리 : " + oil * 8 + "km");
	}
	
	public void speedUp() {
		speed += 10;
		System.out.println("가속중...");
	}
	public void speedDown() {
		speed -= 10;
		System.out.println("감속중...");
	}
	public void now() {
		System.out.println("현재 속력은 " + speed + "km/h 입니다");
	}
	
	
}
