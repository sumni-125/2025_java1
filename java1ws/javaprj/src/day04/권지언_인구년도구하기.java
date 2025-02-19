package day04;

public class 권지언_인구년도구하기 {

	public static void main(String[] args) {
		 
		
		 double  h_pop = 2500000;
		 double k_pop = 1800000;
		 double h_inc=0.036;
		 double k_inc  =0.042;
		 int year=1999;
		 
		 while(h_pop >= k_pop ) {    
			 
			 h_pop = h_pop + h_pop *h_inc;
			 k_pop = k_pop + k_pop *k_inc;
			 year++;
		 }
		 
		 // k_pop <= h_pop
		
		 System.out.println( year);
		 

		 
		 
	}

}
