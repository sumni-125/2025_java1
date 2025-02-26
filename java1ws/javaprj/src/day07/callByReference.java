package day07;

public class callByReference {

	public static void main(String[] args) {
			   //=배열공간확보(메모리 확보)하고 시작 주소를 반환
		int []arr= new int[]{7,8,9,10,12};
		
		//arr : 참조형 변수 (주소를 기억하는 변수가 필요하다..!)
		//주소를 저장하는 변수 : 참조형 변수
		
		
		//배열 출력하기
		/*
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		*/
		printArray(arr);
	}
	
	//배열 출력하는 함수 만들기
	//함수명 : printArray
	//기능 : 배열 출력하기
	//입력 :int[] 배열
	//반환 : X
	public static void printArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
