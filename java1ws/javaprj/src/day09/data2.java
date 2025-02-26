package day09;

//캡슐화하기
//데이터+ 데이터를 다루는 함수(매서드)를허너우ㅏ 뮸음다뉘로 만들어서 프로그래밍하는 방식이다


public class data2 {
	
	
	String a;
	int b;
	double c;
	int d;
	
	//public void 입력하기(data2 k) { //data2 this 라는 매개변수가 자동으로 들어간다
	public void 입력하기( ) {
		
		//입력하기
		this.a = "ㅇㅇ";
		this.b = 21432;
		this.c = 4253;
		
		
		
		
	}
	
	
	//public void  출력하기(data2 k) {	//data2 this라는 매개변수가 자동으로 들어간다
	public void  출력하기( ) {
		System.out.println(this.a+","+this.b+","+this.c);
	}
	
}



//static => 함수(매서드) =>호출 클래스명, 매서드이름()
//static이 빠진 것 => 데이터를 다루는 함수들이기 때문에 데이터가 만들어진 후 부터 사용할 수 있다.
