package day16.복습정리.배열;

import java.util.Arrays;

public class 배열복사2 {

	public static void main(String[] args) {
		
		//arr배열을 더 큰배열로 만들어야 한다면 
		//1. 더큰 배열을 만든다.
		//2. 기존배열의 요소 하나 하나를 새로운 배열에 저장한다
		//3. 새로운배열을 참조하도록  참조를  변경한다
		 
		int[] arr  = { 6,8,5,9,11};
		
		//1.
		int[] tempArr  = new int[10];
		
		//반복문으로 기존배열의 요소를 옮겨야 한다
		
		//2. 라이브러리 사용하자
		                 //원본 , 시작index ,  대상 , 시작index, 몇개
		 System.arraycopy(arr, 0, tempArr, 0, arr.length);
		
		//3.
		arr = tempArr;
		
		
		//배열출력하기   Arrays.toString() 매서드 : 배열의 요소를 하나의 String으로 만들어서 반환해주는 기능, 라이브러리이다
		
		System.out.println(  Arrays.toString(arr));
	 
		
		String result="[";
		for( int i=0; i< arr.length-1 ; i++) {
			result +=  arr[i] +" , ";
		}
		result += arr[arr.length-1] +" ";
		result +="]";
		
		System.out.println( result);
		
		

	}

}
