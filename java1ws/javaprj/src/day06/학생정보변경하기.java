package day06;

import java.util.Scanner;

public class 학생정보변경하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String[] names  = new String[5];
		
		
		names[0]="정연수";
		names[1]="최지태";
		names[2]="김보성";
		names[3]="황예지";
		names[4]="최하은";
		
		
		//학생조회하기
		for(int i=0;i<names.length;i++) {
			System.out.println(i+1+". " +names[i]);
		}
		
		//변경할 학생의 번호를 입력한다
		
		int updateNo = sc.nextInt();
		
		//변경할 이름을 입력하세요
		
		String temp = sc.next();
		
		names[updateNo-1]=temp;
		
		for(int i=0;i<names.length;i++) {
			System.out.println(i+1+". " +names[i]);
		}
	}

}
