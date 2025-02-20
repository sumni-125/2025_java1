package day05;

import java.util.Scanner;

public class 배열응용문제1_이수민 {

	public static void main(String[] args) {
		//배열 응용문제1
		
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
