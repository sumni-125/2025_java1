package day11.변수종류_초기화;

class Acorn{
	
	private  String id;  // 인스턴스변수  , new에 의해서 메모리 확보 
	private  String pw;
	private  String name;
	
	
	
     static   int cnt=0;   //클래스변수,  클래스내에서 공유할 목적, 한 개 생긴다. 
     static   String teacher="우주연";
	
	//생성자  (인스턴스변수에 값넣는 방법)
	
	public  Acorn( String id, String pw, String name) {
		
		cnt= cnt+1;
		
		this.id = id;
		this.pw = pw;
		this.name  = name;
		
	}
	
	//기본생성자
	public Acorn() {
		
	}
	
	//매서드 (방법 : 데이터를 사용하는 방법을 제공하겠다  ) 
	
	
	
	public String toString() {
		return id+ " " + pw +  " " + name;
	}
	
	
	//getter ,  각 속성의 값을 반환하는 방법 
	//getter 규칙   get속성명 ()   , 속성명의 첫글자 대문자 규칙 
	
	public String getId() {
		return id;
	}
	
	
	public String getPw() {
		return pw;
	}
	
	public String getName() {
		return name;
	}
	
	//비번변경 해야된다 
	//속성값을 변경하는 방법 
	//setter
	//규칙 set속성명 (첫글자 대문자)
	
	public void setPw( String pw) {
		this.pw  =pw;
	}
	
	
	
	
	// 이유 : 객체 생성이후 사용할 수 있는 매서드 이기 때문에 
	// 객체생성과 상관없이 바로 사용할 수 있는 변수를 사용하는 것은 당연하다 
	
	
	//
	// public void printCnt() {  => 가능함 이유는 위에)
	public static void printCnt() {   //객체생성과 상관없이 사용할 수 있다 
		                              //
		System.out.println( cnt);		
	}
	
	
	

	
	//매서드 작성시 
	//static 여부 결정하는 기준은 
	//인스턴스변수의 사용 유뮤  => 사용한다면  인스턴스 매서드 만들어야 한다  (필수) 
	//                   => 사용안한다면 static매서드로 만들 수 있다 ( 선택)   ,
	                 //    static매서드로 사용하는것이 권장
	
	 
}





public class 클래스변수활용 {

	public static void main(String[] args) {

		Acorn acorn = new Acorn("딸기","1234","박시우");
		Acorn acorn2 = new Acorn("포도","9090","정연수");
		Acorn acorn3 = new Acorn("사과","3434","최지태");
		
 
		
		//학생수 구하고 싶다면 
		//
		
		

	}

}
