package day15.정렬;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ScoreArraysList정렬하기 {

	public static void main(String[] args) {
		 
		
		ArrayList list = new ArrayList();		
		/*
		 * 
		 * 
		arr[0]= new Score("박예린", 100,90);
		arr[1]= new Score("이정호", 99,90);
		arr[2]= new Score("김민환", 89,100);
		arr[3]= new Score("김유민", 88,77);
		arr[4]= new Score("박수경", 85,89);		
		
		 */
		
		list.add( new Score("박예린", 100,90));
		list.add( new Score("이정호", 99,90));
		list.add( new Score("김민환", 89,100));
		list.add( new Score("김유민", 88,77));
		list.add( new  Score("박수경", 85,89));
		
		
		//Object  item  =  list.get(0);	 
		Score   item  = (Score) list.get(0);	
		System.out.println( item.kor);
		
		
		
		ArrayList<Score> list2 = new ArrayList<>();
		list2.add( new Score("박예린", 100,90));
		list2.add( new Score("이정호", 99,90));
		list2.add( new Score("김민환", 89,100));
		list2.add( new Score("김유민", 88,77));
		list2.add( new  Score("박수경", 85,89));
		
		
		Score 예린  = list2.get(0);
		System.out.println( 예린.eng);
		
		
		Collections.sort(list2);		
		System.out.println( "===>정렬후==");
		for( Score s : list2) {
			System.out.println( s);
		}
		
		
		
		Collections.sort(list2, new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {  // o1:기준, o2:비교
				// TODO Auto-generated method stub
				
				Score s1  = (Score)o1;
				Score s2  = (Score) o2;				
				
				int result=0;
				if( s1.avg > s2.avg) {
					result=1;
				}else if( s1.avg  <s2.avg) {
					result =-1;
				}
				
				return result;    // 기준이 크면 양수  기준이 작으면 음수가 반환됨
			}});
		
		System.out.println( "===>평균 오름차순 정렬 ==");
		for( Score s : list2) {
			System.out.println( s);
		}
		
		
		
		
	}

}
