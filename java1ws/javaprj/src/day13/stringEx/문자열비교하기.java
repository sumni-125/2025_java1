package day13.stringEx;

import java.util.Arrays;

public class 문자열비교하기 {

	public static void main(String[] args) {
		
		String str = "apple";
		String str2 = "banana";
		
		//문자열 비교 기준.compareTo(비교대상객체)
		
		//반환값이 0이면 => 같다
		//       양수 => 기준이 크다(사전상 뒤에 위치함)
		//       음수 => 기준이 작다(사전상 앞에 위치함)
		
		int result = str.compareTo(str2);
		System.out.println(result);
		
		String[] arr = {"banana","apple","tomato"};
		
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {// 오름차순
				if(arr[i].compareTo(arr[j])>0) {
					
					
					//교환할 때는 임시변수가 필요함
					String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
					
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("\n---------------------------\n");
		
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+", ");
		}
		
		System.out.println("\n---------------------------\n");
		for(String item : arr) {
			System.out.println(item+", ");
		}
		
		
	}

}
