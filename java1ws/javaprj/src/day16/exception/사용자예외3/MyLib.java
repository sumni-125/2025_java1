package day16.exception.사용자예외3;

public class MyLib {
	                                   
	
	//이 매서드는  잘못된나이예외가 발생하므로 예외처리를 하고 사용하세요 !! 라는 의미
	
	
	public boolean isAdult( int age) throws 잘못된나이예외 {
		
		boolean flag=true;
		
		//유효성검사  
		if( age< 0  || age  >200) {
			throw  new  잘못된나이예외();   // chcekd exception이므로 예외처리를 해야함  
		} 
		
		//일반로직
		if( age>=20)
			 flag=true;
		else flag =false;
		
		return flag;
	}

}
