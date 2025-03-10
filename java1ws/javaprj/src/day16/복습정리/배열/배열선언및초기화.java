package day16.복습정리.배열;

public class 배열선언및초기화 {

	public static void main(String[] args) {
		//배열 : 같은자료형 연속적으로 여러개 확보하는 것 
	 
		//int형 데이터 5개를 저장할 수 있는 배열만들기
		int[] arr ;  // arr는 참조형 변수 , 참조대상이 int형 배열임 , 즉 int형배열을 참조함 
		arr= new int[5];
		
		//int형 데이터 5개를 저장할 수 있는 배열만들기
		int[] arr2  = new int[5];

		
		
		//배열선언및 초기화
		int[] arr3= {9,4,5,9,11};
		
		
		
		//배열선언 및 초기화
		int[] arr4=  new int[] {9,4,5,9,11};
		int[] arr5 = new int[] { 8,7,9,4};
		
		
		//배열선언할때만 초기화 가능함  new int[]  생략할 수 있음 
	}

}
