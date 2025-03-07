package day15.정렬.myarrays;

 

public class MyArraysMain {

	public static void main(String[] args) {
	   Score[] arr  = new Score[5];
		
		
		arr[0]= new Score("박예린", 100,90);
		arr[1]= new Score("이정호", 99,90);
		arr[2]= new Score("김민환", 89,100);
		arr[3]= new Score("김유민", 88,77);
		arr[4]= new Score("박수경", 85,89);
		
		
		MyArrays.sort(arr, new A());
		
		//인터페이스 구현방법
		//1.이름있는 클래스로 인터페이스 구현하기 
		//2.익명클래스로 인터페이스 구현하기  ( 상속받으면서 자식클래스를 만들때만 익명으로 만들 수 있다)
		
		//MyComparator() {}   =>익명으로 클래스를 정의하는 부분 
		
		MyArrays.sort( arr,  new MyComparator() {

			@Override
			public int compare(Object o1, Object o2) {   //기준이 크면 양수를 전달하게 또는 기준이 작으면 음수가 전달되게 함 
				
				Score s1 = (Score)o1;
				Score s2 =(Score)o2;
				return s1.name.compareTo(s2.name) ;   //기준문자열이 크면 양수반환 기준문자열이 작으면 음수를 반환하게 되어 있음 
			}});
		
		
		
		
	
		System.out.println( "이름순 정렬 후  ==>");
		
		for( int i=0; i<arr.length; i++) {
			Score score = arr[i];
			System.out.println( score );  // score.toString()
		}
		
		//
		
		
		MyArrays.sort(arr);
		
		

		System.out.println( "국어점수 정렬 후  ==>");
		
		for( int i=0; i<arr.length; i++) {
			Score score = arr[i];
			System.out.println( score );  // score.toString()
		}
		

	}

}
