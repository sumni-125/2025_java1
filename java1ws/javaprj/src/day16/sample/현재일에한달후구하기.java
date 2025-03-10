package day16.sample;

import java.util.Calendar;
import java.util.Date;

public class 현재일에한달후구하기 {
	public static void main(String[] args) {
		 

		Calendar cal = Calendar.getInstance();	
		cal.add(Calendar.MONTH, 1);
		
		
		Date month1 = cal.getTime();
		System.out.println( month1);
	}

}
