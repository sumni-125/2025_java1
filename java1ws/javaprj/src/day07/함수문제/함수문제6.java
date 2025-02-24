package day07.함수문제;

import java.util.Scanner;

public class 함수문제6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] nums = new int[5];
		System.out.println("숫자를 "+nums.length+"개 입력하세요.");
		
		for(int i=0;i<nums.length;i++) {
			nums[i]= sc.nextInt();
		}
		
		int max=maxNum(nums);
		System.out.println("최대값은 "+max+"입니다");
	}
	public static int maxNum(int[] nums) {
		
		int max=nums[0];
		
		for(int i=0;i<nums.length;i++) {
			if(max<nums[i]) {
				max=nums[i];
			
			
			}
		}
		return max;
	}
}
