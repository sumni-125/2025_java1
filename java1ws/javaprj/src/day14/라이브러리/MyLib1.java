package day14.라이브러리;



public class MyLib1 {
	public void printStar() {
		System.out.println("***");
	}
	
	//원하는 문자를 세번 출력하기
	public void printChar(char ch) {
		for(int i=0;i<3;i++) {
			System.out.println(ch);
		}
	}
	
	//원하는 코드를 세번 실행하기
	//결정할 수 없는 코드 => 인터페이스로 만든다.
	
	public void 세번실행하기(MyRun code) {
		for (int i=0;i<3;i++) {
			code.run();
		}
	}
}
