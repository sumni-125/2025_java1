package day05;

import java.util.Scanner;

public class 짝수배열문제_이수민 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1차배열 (정수형배열  10개) , 숫자 10개를 저장할 수 있는 배열 준비하기  
		//수를 입력받아서 짝수만 저장하고 출력하기 
		//수가 0이면 입력되면 종료
		
		int i=0;
		int num;
		int[] nums = new int[10];
		
		Scanner sc = new Scanner(System.in);
		
		while(i<nums.length) {
			num=sc.nextInt();
			if(num==0) {
					break;
			}
			if(num%2==0) {
				
				nums[i]=num;
				i++;
			}
			
			
		}
		
		for(int j=0;j<i;j++) {
			System.out.print(nums[j]+" ");
		}
		
	}

}
