package day03_순서도코딩해보기;

public class easy_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1~99 홀수 더하기
		int sum=0;
		
		for(int i=1;i<=100;i++) {
			if(i%2==1) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}

}
