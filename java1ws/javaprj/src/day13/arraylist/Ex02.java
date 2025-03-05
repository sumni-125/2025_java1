package day13.arraylist;

import java.util.ArrayList;

public class Ex02 {

	public static void main(String[] args) {
		 
		
		
		//ArrayList 제네릭버전 
		//다운캐스팅의 불편함을 해소해주는 제네릭버전 
		
		ArrayList<Score> list = new ArrayList<>();
		
		
		//등록
		
		list.add( new Score("이정호",100,90));
		list.add( new Score("김민환", 90,100));
		list.add( new Score("김유민", 90,99));
		list.add( new Score("박수경",100,100));
		
		
		//조회
		for( int i=0 ; i< list.size() ; i++) {
			Score item  = list.get(i);
			System.out.println( item);  // item.toString()
			item.printInfo();
		}
		
		 
		
		//변경
		
		
		String name="박수경";
		Score search= null;		
		for( int i=0; i<list.size() ; i++) {
			
			Score s= list.get(i);
			if( s.getName().equals(name)) {  //
				search  = s;
				break;
			}
		}		
		
		
		if( search !=null) {
			
			//변경할 국어, 영어점수
			int newKor  = 99;
			int newEng=98;
			
			search.setKor(newKor);
			search.setEng(newEng);
			
			System.out.println("변경이 완료");
			
		}		  
		
		//삭제
		
		String deleteName="김민환";
		Score deleteScore = null;
		
		
		for(  int i=0; i< list.size() ; i++) {
			Score s  =list.get(i);
			if( s.getName().equals(deleteName)) {
				deleteScore = s;
				break;
			}
		}
		
		
		
		if( deleteScore  !=null) {			
			list.remove(deleteScore);
			System.out.println("삭제되었음");
		}
		
		//
		
		//조회
		for( int i=0 ; i< list.size() ; i++) {
			Score item  = list.get(i);
			System.out.println( item);  // item.toString()
			item.printInfo();
		}
	}

}
