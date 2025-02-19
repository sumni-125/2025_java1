package day03;

public class 연산자_증감연산자_10까지합 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1~10까지 합
		/*
		int n=0;
		int sum=0;
		
		while(n<10) {
			n=n+1;
			sum=sum+n;
		}
		
		
		System.out.println(sum);
		*/
		
		int n=0;
		int sum=0;
		
		while(++n<10) {
			sum=sum+n;
			
		}
		System.out.println(sum);
		
		
	}

}
