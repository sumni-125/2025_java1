package day14.인터페이스.인터페이스연습;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		 
		ArrayList<Object> list = new ArrayList<>();
		list.add( new 박예린());
		list.add( new 이정호());
		list.add( new 김민환());
		list.add( new 김유민());
		list.add( new PSK());
		list.add( new 이수민());
		list.add( new 권지언());
		list.add( new 이동우());
		list.add( new 오윤석());
		//list.add( new 윤현기());
		list.add( new 김보성());
		list.add( new 최지태());
		list.add( new 정연수());
		list.add( new 최하은());
		list.add( new 황예지());
		

		
		ArrayList<나는게가능한>  나는그룹 = new ArrayList<>();
		ArrayList<많이먹는게가능한>  많이먹는그룹 = new ArrayList<>();		
		ArrayList<변신가능한>  변신그룹 = new ArrayList<>();		
		ArrayList<불어가능한>  불어그룹 = new ArrayList<>();		
		ArrayList<싸움이가능한17대1>  싸움그룹 = new ArrayList<>();		
		ArrayList<장풍이가능한>  장풍그룹 = new ArrayList<>();		
		ArrayList<태권도가가능한>  태권도그룹 = new ArrayList<>();
		
		
		

		for( int  i =0 ;  i<  list.size()  ;i ++) {
			
			Object o   = list.get(i);
			
			if(  o instanceof 나는게가능한 ) {
				나는그룹.add( (나는게가능한)  o);				
			}
			
			
			
			if(  o instanceof 많이먹는게가능한 ) {
				많이먹는그룹.add( (많이먹는게가능한)  o);				
			}
			
			

			if(  o instanceof 변신가능한 ) {
				변신그룹.add( (변신가능한)  o);				
			}
			

			if(  o instanceof 불어가능한 ) {
				불어그룹.add( (불어가능한)  o);				
			}
			
			
			
			if(  o instanceof 싸움이가능한17대1 ) {
				싸움그룹.add( (싸움이가능한17대1)  o);				
			}
			
			
			if(  o instanceof 장풍이가능한 ) {
				장풍그룹.add( (장풍이가능한)  o);				
			}
			
			
			
			if(  o instanceof 태권도가가능한 ) {
				태권도그룹.add( (태권도가가능한)  o);				
			}
			
		}
		
		
		// 일괄명령주기			
		System.out.println( "나는그룹");
		for( int i=0 ; i< 나는그룹.size() ;i++ ) {
			나는그룹.get(i).날수있다();
		}
		
		
		
		
		for( int i=0 ; i< 많이먹는그룹.size() ;i++ ) {
			많이먹는그룹.get(i).많이먹다();;
		}
		
		

		for( int i=0 ; i< 변신그룹.size() ;i++ ) {
			변신그룹.get(i).변신하기();
		}
		
		
		

		for( int i=0 ; i< 불어그룹.size() ;i++ ) {
			불어그룹.get(i).불어를한다();
		}
		
		

		for( int i=0 ; i< 싸움그룹.size() ;i++ ) {
			싸움그룹.get(i).싸움하기();
		}
		
		

		for( int i=0 ; i< 장풍그룹.size() ;i++ ) {
			장풍그룹.get(i).장풍날리기();
		}
		
		

		for( int i=0 ; i< 태권도그룹.size() ;i++ ) {
			태권도그룹.get(i).태권도하기();
		} 
		
		
		
		

	}

}
