package day07;

public class 합구하기_10_함수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getTentotal();
		int result = getTentotal2();
		System.out.println(result);
	}

	private static void getTentotal() {
		int sum =0;
		for (int i=1;i<=10;i++) {
			sum+=i;
		}
		System.out.println(sum);
	}

	private static int getTentotal2() {
		int sum =0;
		for (int i=1;i<=10;i++) {
			sum+=i;
		}
		//System.out.println(sum);
		return sum;
	}
}
