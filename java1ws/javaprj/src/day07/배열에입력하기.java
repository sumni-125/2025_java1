package day07;

public class 배열에입력하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		입력하기(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
	}
	
	public static void 입력하기(int[] arr) {
		arr[0] = 8;
		arr[1] = 13;
		arr[2] = 7;
		arr[3] = 10;
		arr[4] = 11;
	}

}
