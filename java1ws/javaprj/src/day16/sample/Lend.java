package day16.sample;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Lend {

	
	 String  lendId ;
	 Date lendDate ;
	 Date  returnDate;
	 Book book;
	 boolean returnFlag;	  
	 
	 
	 
	public Lend(String lendId, Date lendDate, Date returnDate, Book book) {
		super();
		this.lendId = lendId;
		this.lendDate = lendDate;
		this.returnDate = returnDate;
		this.book  = book;	 
		 
	}


	@Override
	public String toString() {
		SimpleDateFormat  sf = new SimpleDateFormat("yyyy-MM-dd");	
		
		String lendDateS =  sf.format(lendDate.getTime());
		String returnDateS =  sf.format(returnDate.getTime());
		//
		return "Lend [lendId=" + lendId + ", lendDate=" + lendDateS + ", returnDate=" + returnDateS + ", book=" + book
				+ ", returnFlag=" + returnFlag + "]";
	}


	public void setReturnFlag(boolean returnFlag) {
		this.returnFlag = returnFlag;
	}
	
	


 
 
	
	
	
	 
 
}
