package day16.복습정리.배열;

public class 배열복사 {

	public static void main(String[] args) {
		
		//arr배열을 더 큰배열로 만들어야 한다면 
		//1. 더 큰 배열을 만든다.
		//2. 기존배열의 요소 하나 하나를 새로운 배열에 저장한다
		//3. 새로운배열을 참조하도록  참조를  변경한다
		 
		int[] arr  =  new int[]{ 6,8,5,9,11};
		
		//1.
		//배열은 자료형의 기본값으로 초기화가 이루어집니다.
		int[] tempArr  = new int[10];
		
		//반복문으로 기존배열의 요소를 옮겨야 한다
		
		//2.
		for( int i=0; i< arr.length ; i++) {			
			tempArr[i] = arr[i];
		}
		
		//3.
		arr = tempArr;
		
		
		//4. 배열확인해 보기
		
		for( int i=0; i< arr.length; i++) {
			System.out.print(  arr[i] + " ,");
		}
		

	}

}
