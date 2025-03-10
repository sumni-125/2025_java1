package day16.exception.checked;

import java.io.IOException;



public class 키보드로부터읽기 {

	public static void main(String[] args) {
		 
	
	//한 바이트 읽어옴
    //예외처리가 필수인경우가 있다.	  ( 처리방법: try-catch , throws  )
	//예외상황에 대한 코드를 작성해야 한다
	
    int result=0;
	try {
		result = System.in.read();   //예외처리가 필수이다
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     System.out.println( (char)result);
		

	}

}
