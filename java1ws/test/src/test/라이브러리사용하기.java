package test;

import day08.PSK;

public class 라이브러리사용하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//화폐매수 구하기
		//수경님 라이브러리 사용해보기
		//1. 다운로드
		//2. 등록
		
		
		int[] result = PSK.work2("박수경", 556930);
		
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]);
		}
	}

}
