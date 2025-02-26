package day09;

public class 실습문제2_이수민 {
	
	long orderNum;
	String id;
	String date;
	String name;
	String pNum;
	String addr;
	
	public void setInfo(long orderNum, String id, String date, String name, String pNum, String addr) {
		this.orderNum=orderNum;
		this.id=id;
		this.date=date;
		this.name=name;
		this.pNum=pNum;
		this.addr=addr;
	}
	public void printInfo() {
		System.out.println(this.orderNum+", "+this.id+", "+this.date+", "+this.name+", "+this.pNum+", "
				+this.addr);
	}
}
