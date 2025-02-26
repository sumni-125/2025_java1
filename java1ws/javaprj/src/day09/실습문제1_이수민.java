package day09;

public class 실습문제1_이수민 {
	
	int age;
	String name;
	boolean marriage;
	int kids;
	
	public void setInfo(int age,String name,boolean marriage,int kids) {
		this.age=age;
		this.name=name;
		this.marriage=marriage;
		this.kids=kids;
	}
	public void printInfo() {
		System.out.println(this.age+", "+this.name+", "+this.marriage+", "+this.kids);
	}
}
