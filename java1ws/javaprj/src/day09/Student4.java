package day09;

public class Student4 {
	
	private String name;
	private int kor;
	private int eng;
	private int total;
	private double avg;
	
	
	public void input(String name, int kor, int eng) {
		
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		
	}
	
	//성적처리하기
	
	private void calcTotal() {
		total=kor+eng;
	}
	
	public void cal() {
		calcTotal();
		avg=total/2.0;
	}
	
	public void printInfo() {
		System.out.println(this.name);
		System.out.println(this.kor);
		System.out.println(this.eng);
		System.out.println(this.total);
		System.out.println(this.avg);
		
	}
}
