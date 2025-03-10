package day16.복습정리.함수매서드;


//return문이란  함수가 호출되고 return문을 만나면 그 이후의 코드는 수행되지 않고 다시 호출한 쪽으로 돌아감
//return문이 없는 경우는 함수의 닫히는 블럭에서 자동으로  return됨

public class return문 {
	
	public int 두배만들기(int  amount) {  
		if( amount <0)  {
			System.out.println("-금액 안됨");
			return 0;
		}
		return amount*2;                
	} 
	
	
	public void 매서드() {
		System.out.println("매서드 호출");
	}
	
	public static void main(String[] args) {
		 
		return문   o  = new return문();
		int result  =o.두배만들기(-5000);
		System.out.println( result);
		
		
		o.매서드();

	}

}
