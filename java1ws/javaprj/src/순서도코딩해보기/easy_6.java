package 순서도코딩해보기;
import java.util.Scanner;

public class easy_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int input;
		int sum=0, avg=0;
		
		for(int i=0;i<5;i++) {
			input= sc.nextInt();
			sum+=input;
		}
		avg=sum/5;
		
		System.out.println("합: "+sum+" 평균: "+avg);
	}

}
