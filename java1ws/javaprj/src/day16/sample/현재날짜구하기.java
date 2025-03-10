package day16.sample;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class 현재날짜구하기 {

	public static void main(String[] args) {		 
		
		
		//Calendar 클래스를 사용하여 날짜관련 기능들(라이브러리)을 사용할 수 있다.
		//현재날짜및 지정일날짜를 얻어 올수 있고 몇일 후나 몇달 후의 날짜정보를 얻어 올 수 있다. (자바가 제공하는 기능이다)
		Calendar current = Calendar.getInstance();	
		
		
		//Calender 추상클래스로 만들어진 클래스이다. 객체생성불가 
		//  getInstance매서드를 사용하여 날짜 기능을 제공하는 객체를 얻어옴 	 
		//  Calendar calendar = Calendar.getInstance(); // GregorianCalendar 반환   컴퓨터 시스템정보를 사용하여 적절한 calendar 반환함 
	 
		System.out.println( current.getTime());		
		//원하는 형식으로 보여주기
		
		
		SimpleDateFormat  sf = new SimpleDateFormat("yyyy-MM-dd");	  //날짜포멧
		String currentF =  sf.format(current.getTime());		
		System.out.println( currentF);
		
	}

}
