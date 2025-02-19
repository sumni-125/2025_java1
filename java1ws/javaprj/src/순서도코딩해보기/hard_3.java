package 순서도코딩해보기;

public class hard_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//fibonacci
		
		long num1=0;
		long num2=1;
		
		//1 1 2 3 5 
		
		System.out.println(num2);
		
		
		int cnt=0;
		
		while(cnt<50) {
			cnt++;
			num2=num2+num1;
			System.out.println(num2);
			num1=num2-num1;
		}
		
		
	}

}
