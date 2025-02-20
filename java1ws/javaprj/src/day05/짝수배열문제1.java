package day05;

import java.util.Arrays;
import java.util.Scanner;

public class 짝수배열문제1 {

	public static void main(String[] args) {
		 ////1)숫자를 입력 받아서 10개  (배열에 저장한 후 )    =>   배열의 내용을  10개를 출력하기 
		 ///
		 
		
		int[] nums  = new int[10];				
		Scanner sc = new Scanner( System.in);
		
		 
		//배열을 사용해서  입력과 출력을 분리해서 사용하기
		
		//입력 
		nums[0] = sc.nextInt();
		nums[1] = sc.nextInt();
		nums[2] = sc.nextInt();
		nums[3] = sc.nextInt();
		nums[4] = sc.nextInt();
		nums[5] = sc.nextInt();
		nums[6] = sc.nextInt();
		nums[7] = sc.nextInt();
		nums[8] = sc.nextInt();
		nums[9] = sc.nextInt();
		
		
		
		
		//배열의 요소 출력하기 
		
		for(int i=0 ; i< nums.length ; i++) {
			System.out.println( nums[i]);
		}
		
		
		
		System.out.println( Arrays.toString(nums) );
		
		
		String str="[";
		for(int i=0 ; i< nums.length ; i++) {
			str += nums[i] +",";
		}
		
		str+="]";
		
		System.out.println( str);
		
		
   }

}
