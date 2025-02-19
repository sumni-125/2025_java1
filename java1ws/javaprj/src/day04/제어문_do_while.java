package day04;

public class 제어문_do_while {

	public static void main(String[] args) {
		// 1~10합구하기
		
		int i=1;
		int sum=0;
		do {
			sum=sum+i;
			i++;
		}while(i<=10);
		
		System.out.print(sum);
		
	}

}
