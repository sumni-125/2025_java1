package day16.sample;

import java.util.Calendar;
import java.util.Date;

public class 현재일에10일후구하기 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar cal = Calendar.getInstance();	
		
		cal.add(Calendar.DATE, 10);
		
		
		Date days10 = cal.getTime();
		System.out.println( days10);
		
		
	}

}
