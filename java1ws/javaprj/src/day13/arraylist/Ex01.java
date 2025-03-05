package day13.arraylist;

import java.util.ArrayList;

public class Ex01 {

	public static void main(String[] args) {
		 

		//객체배열대신에  ArrayList 사용하기  
		
		//순서가 있다 
		//중복된 데이터를 저장할 수 있다 
		//배열과 같은 구조라고 생각하면된다 
		
		ArrayList list = new ArrayList();
		
		list.add( new Score("이정호",100,90));
		list.add( new Score("김민환", 90,100));
		list.add( new Score("김유민", 90,99));
		list.add( new Score("박수경",100,100));
		
		
		
		for( int i=0 ; i< list.size(); i++) {
			Object item   = list.get(i);   //Object로 반환되었기 때문에 Object로 참조하기 때문에 Object가 가지는 것만큼 사용할 수 있다
			
		
			System.out.println( item);  // item.toString();
			
			//((Score)item).printInfo();  // 다운캐스팅
			Score itemScore  = (Score)item;
			itemScore.printInfo();
			
		}
		
	}

}
