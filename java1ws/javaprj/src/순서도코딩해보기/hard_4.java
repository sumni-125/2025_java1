package 순서도코딩해보기;
import java.util.Scanner;

public class hard_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		int ko_score=0, en_score=0, ma_score=0;
		int per_sum=0, per_avg=0;
		
		int ko_sum=0, en_sum=0, ma_sum=0;
		int ko_avg=0, en_avg=0, ma_avg=0;
		
		int cnt=0;
		
		for(cnt=0;cnt<3;cnt++) {
			String name = sc.nextLine();
			ko_score= sc.nextInt();
			ma_score= sc.nextInt();
			en_score= sc.nextInt();
			
			sc.nextLine();
			
			per_sum=ko_score+en_score+ma_score;
			per_avg=per_sum/3;
			
			ko_sum+=ko_score;
			en_sum+=en_score;
			ma_sum+=ma_score;
			
			System.out.println(name+"님의 점수");
			System.out.println("국어: "+ko_score);
			System.out.println("수학: "+ma_score);
			System.out.println("영어: "+en_score);
			System.out.println("평균점수: "+per_avg);
		}
		
		ko_avg=ko_sum/cnt;
		en_avg=en_sum/cnt;
		ma_avg=ma_sum/cnt;
		
		System.out.println("과목별 평균점수");
		System.out.println("국어: "+ko_avg);
		System.out.println("수학: "+ma_avg);
		System.out.println("영어: "+en_avg);
	}

}
