package 순서도코딩해보기;

public class easy_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int su=1;
		while(sum<1000) {
			sum=sum+su;
			su+=2;
		}
		System.out.println(su-2);
	}

}
