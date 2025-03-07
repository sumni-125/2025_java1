package day15.정렬.myarrays;

 

public class A  implements  MyComparator{

	@Override
	public int compare(Object o1, Object o2) {   //기준, 비교    기준이크면 양수, 기준이 작으면 음수 
		// TODO Auto-generated method stub
		
		Score  s1  =(Score)o1;
		Score  s2=  (Score)o2;
		
		
		return s1.eng - s2.eng ;    // 기준의 영어점수가 크면 양수가 전달 
		                            // 기준의 영어점수가 작으면 음수가 전달 
	}

}
