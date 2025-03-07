package day15.정렬.myarrays;

public class MyArrays {

	
	//
	public static void sort( Object[] obj) {
		
		
		for( int i=0; i< obj.length-1 ; i++) { 
			
			for(int j=i+1 ; j<obj.length ; j++) {
				
			 
			//	MyComparable item  = (MyComparable)obj[i];				
			//	if( item.compareTo(obj[j])  > 0 )  {    //양수이면  [i]  [j] 교환 (자리바꿈)
				
				if( ((MyComparable)obj[i]).compareTo(obj[j])  >0 ) {  //기준 
					
					Object temp= obj[i];
					obj[i] =obj[j];
					obj[j]= temp;
					
				}			 
			} 
			
		}
		
		
		
	}
	
	
	//
	
	public static void sort(Object[] obj, MyComparator c) {
		
		
		for( int i=0; i< obj.length-1; i++) {
			
			for( int j=i+1 ; j<obj.length; j++) {
				// 기준과 비교객체 
				// c.compare( 기준, 비교)    =>  양수,  음수 			
				 if(  c.compare(obj[i] , obj[j])   >0) {
					 
					 Object temp;
					 
					 temp=obj[i];
					 obj[i]=obj[j];
					 obj[j]=temp;
					 
					 
				 }
			}
		}
		
	}
}
