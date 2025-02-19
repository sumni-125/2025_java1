package day04;

public class 제어문_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int odd_sum=0;
		for(int i=0;i<=10; i++) {
			if(i%2 == 0) {
				continue;
			}
			odd_sum = odd_sum+i;
		}
		
		System.out.println(odd_sum);
		
		
	}

}
