package day07.함수문제;

public class 함수문제7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {12,15,35,9,46};
		int avg = avgNums(nums);
		
		System.out.print("평균값은 "+avg);
	}
	public static int avgNums(int[] nums) {
		int sum=0, avg=0;
		for(int i=0;i<nums.length;i++) {
			sum+=nums[i];
		}
		avg=sum/nums.length;
		return avg;
	}
}
