package day03_순서도코딩해보기;

public class easy_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1+(1+2)+(1+2+3)+...+(1+2+...+100)
		
		int sum=0;
		
		for(int i=0;i<100;i++) {
			for(int j=1;j<=i;j++) {
				sum+=j;
			}
		}
		
		System.out.println(sum);
		
		
	}

}
