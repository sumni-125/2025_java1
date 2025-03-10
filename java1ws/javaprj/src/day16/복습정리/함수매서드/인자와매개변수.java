package day16.복습정리.함수매서드;


//인자란?  함수(매서드) 호출할 때 넘겨주는 값  (Argument)
//매개변수란? 함수가 호출될 때 넘겨주는 값을 저장할 수 있는 변수를 말한다 (파라미터 :parameter) , 매개자역할을 하는 변수
public class 인자와매개변수 {


	public int 두배만들기(int  amount) {   // 호출시 전달된  돈을 저장할 수 있는 변수 amount를 매개변수라고 한다
		return amount*2;                
	}                                
	                                    
	
	
	public static void main(String[] args) {
		 
		 
		인자와매개변수   o  = new 인자와매개변수();
		int result  =o.두배만들기(5000);    // 5000값이 인자
		System.out.println( result);

	}

}
