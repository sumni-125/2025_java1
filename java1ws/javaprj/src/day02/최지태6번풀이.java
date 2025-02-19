package day02;

import java.util.Scanner;

public class 최지태6번풀이 {

	public static void main(String[] args) {
		  
			String name;
			int kor;
			int eng;
			int math;
			
			double total_avg=0;
			double kor_avg=0;
			double eng_avg=0;
			double math_avg=0;
			
			int index=0;
			
			
			Scanner sc = new Scanner( System.in);
			while(true) {
				
				 
				
				name = sc.nextLine();
				kor  =  Integer.parseInt(sc.nextLine());  //"90" =>90
				eng   = Integer.parseInt( sc.nextLine());			
				math   = Integer.parseInt( sc.nextLine());
		
				//종료 조건 
				
				if( name.equals("끗")) {
					break;
				}
				
				
				total_avg  =  (kor+eng+math) /3.0;
				
				if(total_avg >=90) {
					System.out.println("Excellent");
				}else if(total_avg <60  ) {
					System.out.println("Fail");
				}
				
				
				System.out.println( kor + " "  + eng + " " +  math+ " "  + total_avg);
				
				total_avg=0;
				
				kor_avg = kor_avg+ kor;
				eng_avg = eng_avg + eng;
				math_avg = math_avg+ math; 
				
				index= index+1;
				
				
				
			}
			
			 
			//과목별 평균구하기 
			
			kor_avg = kor_avg/index;
			eng_avg = eng_avg/index;
			math_avg = math_avg/index;
			
			//과목별 평균 출력
			
			System.out.println( "국어평균=" +kor_avg);
			System.out.println( "영어평균="  + eng_avg);
			System.out.println( "수학평균="  + math_avg);
			
			 
			
		}
	 

}
