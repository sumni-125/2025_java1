package day06;

public class 가장높은온도구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//                          0    1   2   3    4    5  6 
		
		  int[] temperatures   =  { 33 , 35, 32 ,35  ,36 ,35 ,34  }  ;
		  int max= temperatures[0];  //초기값 설정   또는  배열범위의 가장 작은 값 
		  
		 /* 
		  //첫번째 요소  max변수의 값 비교
		  if( temperatures[0] > max) {        // 33        >  33
			  
			  max  =  temperatures[0] ;
		  }
		  
		  if( temperatures[1] > max) {       //34       >  33
			  max  =temperatures[1] ;        // max=34
			  
		  }
		  
		
		  if( temperatures[2] > max) {    // 32  >  34
			  max  =temperatures[2] ;
			  
		  }
		  
		  if( temperatures[3] > max) {   // 35 > 34
			  max  =temperatures[3] ;    // max  =35
			  
		  }
		  
		  if( temperatures[4] > max) {   // 36  > 35
			  max  =temperatures[4] ;    // max  =36
			  
		  }  
		  
		  if( temperatures[5] > max) {  // 35 > 36
			  max  =temperatures[5] ;
			  
		  }  
		   
		  
		  if( temperatures[6] > max) {  //34 > 36
			  max  =temperatures[6] ;
			  
		  }  
		    
		      System.out.println( max);
		  
		  */
		  
		 
		  
		  
		  
		  
		  for( int i=0; i< temperatures.length ;  i++) {
			  if( temperatures[i] > max) {        // 33        >  33
				  
				  max  =  temperatures[i] ;
			  }			  
			  
		  }
		  
		  System.out.println( max);
		  

	}

}
