package day09;

public class 실습문제3_이수민 {
	String name;
	int kor;
	int eng;
	private double total;
	private double avg;
	
	
	public void setInfo(String name, int kor, int eng) {
		this.name=name;
		this.kor=kor;
		this.eng=eng;
	}
	
	public void calcTotal() {
		total=kor+eng;
	}
	
	public void calcAvg() {
		calcTotal();
		avg=total/2.0;
	}
	
	public void printInfo() {
		System.out.println("학생이름:"+this.name);
		System.out.println("국어:"+this.kor);
		System.out.println("영어:"+this.eng);
		System.out.println("평균:"+this.avg);
	}
}
