package day09;

public class 실습실행결과 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		실습문제1_이수민 a=new 실습문제1_이수민();
		a.setInfo(40, "James", true, 3);
		a.printInfo();
		
		실습문제2_이수민 b=new 실습문제2_이수민();
		b.setInfo(201803120001l, "abc123", "2018년3월12일", "홍길순", "D0345-12", "서울시 영등포구 여의도동 20번지");
		b.printInfo();
		
		실습문제3_이수민 c=new 실습문제3_이수민();
		c.setInfo("홍길동",90, 80);
		c.calcAvg();
		c.printInfo();
	}

}
