package day03_순서도코딩해보기;

public class hard_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int mul;//분모계산
		int n=-1;//부호결정
		double su, sum=0;//현재항, 총합
		
		for(int i=1;i<=10;i++) {
			
			mul=1;
			n=n*(-1);
			su=0;
			
			for(int j=1; j<=i; j++) {
				mul=mul*j;
			}
			
			su = i/(double)mul;
			su=su*n;
			sum+=su;
			
			System.out.println(su);

		}
		System.out.println("\n합: "+sum);
	}

}
