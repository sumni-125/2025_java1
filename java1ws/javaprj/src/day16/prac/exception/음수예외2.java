package day16.prac.exception;


//unchecked Exception을 만들고 싶다면
//RuntimeException을 상속받자
public class 음수예외2 extends RuntimeException {

	public 음수예외2() {
		
	}
	public 음수예외2(String message) {
		super(message);
	}
	
}
