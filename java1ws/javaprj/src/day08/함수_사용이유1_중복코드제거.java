package day08;

public class 함수_사용이유1_중복코드제거 {

	public static void main(String[] args) {
		/*System.out.println("치약을 짠다");
		System.out.println("이를 닦는다");
		System.out.println("헹군다");
		
		System.out.println("치약을 짠다");
		System.out.println("이를 닦는다");
		System.out.println("헹군다");
		
		System.out.println("치약을 짠다");
		System.out.println("이를 닦는다");
		System.out.println("헹군다");*/
	
		양치질하기();
		양치질하기();
		양치질하기();
	}

	//기능
	//입력(매개변수
	//반환
	
	public static void 양치질하기() {
		System.out.println("치약을 짠다");
		System.out.println("이를 닦는다");
		System.out.println("헹군다");
	}
	
	
}
