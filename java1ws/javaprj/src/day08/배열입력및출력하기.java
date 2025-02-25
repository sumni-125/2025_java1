package day08;

public class 배열입력및출력하기 {

	public static void main(String[] args) {
		
		//배열 선언 및 할당과 초기화
		//int[] arr=new int[] {10,8,11};
		
		//배열 선언
		int[] arr;
		
		//배열 할당
		arr = new int[3];
		//arr=new int[] {8,10,11};
		
		
		//arr >> 참조형 변수
		//int형 3개를 가지는 배열의 주소를 저장하는 참조형변수이다
		//참조형변수는 주소를 저장하는 변수를 말한다
		
		
		int[] kors = {100,90,95};
		
		배열출력하기(kors);
		배열출력하기2(kors);
		
	}

	public static void 배열출력하기(int[] kors) {
		for(int i=0; i<kors.length;i++) {
			
			System.out.println(kors[i]);
		}
	}
	
	public static void 배열출력하기2(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
