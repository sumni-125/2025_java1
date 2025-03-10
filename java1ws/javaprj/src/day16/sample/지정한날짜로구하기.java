package day16.sample;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class 지정한날짜로구하기 {
	public static void main(String[] args) {
	  
        int year = 2022;
        int month = 2 ;//   월정보  0부터 시작하기 때문에  -1을  해야 함 
        int day = 12;

    
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month-1, day);   //0월

      
        Date desiredDate = calendar.getTime();

      
    	SimpleDateFormat  sf = new SimpleDateFormat("yyyy-MM-dd");	
		String desiredDateF =  sf.format(desiredDate.getTime());		
		System.out.println( desiredDateF);
		
    } 
}
