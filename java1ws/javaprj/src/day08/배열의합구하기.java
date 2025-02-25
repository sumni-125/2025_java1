package day08;

public class 배열의합구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {70,88,100,89,95};
		
		int sum=0;
		sum=arr[0]+arr[1]+arr[2]+arr[3]+arr[4];
		
		System.out.println(sum);
		System.out.println(배열의합구하기(arr));
	}

	public static int 배열의합구하기(int[] arr) {
		
		int sum=arr[0]+arr[1]+arr[2]+arr[3]+arr[4];
		
		return sum;
	}
	
	public static int 배열의가장큰값구하기(int[] arr) {
		
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		
		return max;
		
	}
	
}
