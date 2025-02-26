package day09;

public class object2 {
	int id;
	String name;
	int count;
	int price;
	
	public void setObject() {
		this.id=12;
		this.name="이수민";
		this.count=3;
		this.price=5000;
	}
	public void printObject() {
		System.out.println("아이디 : " + this.id);
		System.out.println("이름 : " + this.name);
		System.out.println("개수 : " + this.count);
		System.out.println("가격 : " + this.price);
	}
}
