package day13.다형성.음료마시기;

public class 음료마시기프로그램 {

	public static void main(String[] args) {


		AcornStudent[]  list  = new AcornStudent[17];	
		int index =14;
		list[0] = (AcornStudent) new 최지태();
		list[1] = new 음료_권지언();
		list[2] = new Dongwoo();
		list[3] = new 음료_정연수();
		list[4] = new Drink_이정호();
		list[5] = new 임형택();
		list[6] = new 오윤석();
		list[7] = new 음료_김민환();
		list[8] = new 음료_황예지();
		list[9] = new 음료_이수민();
		list[10] = new 음료_김보성();
		list[11] = new 음료_최하은();
		list[12] = new 음료_박수경();
		list[13] = new Americano();
		//list[14] = new 음료_권지언();
		//list[15] = new 음료_권지언();
		//list[16] = new 음료_권지언();
		  	
				
		
	    for( int i=0; i< index ; i++) {
	    	list[i].음료마시기();
	    }
		
	}

}
