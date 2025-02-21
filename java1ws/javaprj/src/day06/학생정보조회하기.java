package day06;

import java.util.Scanner;

public class 학생정보조회하기 {

	public static void main(String[] args) {
		 
		
		//학생정보 (학생이름) 조회하기  ( 학생이름 배열 필요함 )
		
		String[] names  = new String[5];
		
		/*
		names[0]="정연수";
		names[1]="최지태";
		names[2]="김보성";
		names[3]="황예지";
		names[4]="최하은";
		*/
		
		
		
		Scanner sc = new Scanner( System.in);
		
		
		names[0]= sc.next();
		names[1]= sc.next();
		names[2]= sc.next();
		names[3]= sc.next();
		names[4]= sc.next();
		
		
		
		
		
		//배열의 내용 출력하기  (학생조회하기)
		
		for( int i=0; i< names.length ; i++) {
			System.out.println( names[i]);
		}
		
		
		
		
		
		
		
		
		
		
	}

}
