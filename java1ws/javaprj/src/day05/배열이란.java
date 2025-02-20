package day05;

public class 배열이란 {

	public static void main(String[] args) {
		
		// 동일한 기억장소(변수)를 연속적으로 확보하고 사용하는 것을 말한다.
		//반드시 같은 자료형이어야 한다.
		//배열이름 (배열의 기준)으로부터 첨자(인덱스)로 접근한다
		//첨자(인덱스)는 0부터 시작한다
		
		//배열의 가장 중요한 것은
		//배열의 요소에 접근하는 일이다(기억=>저장, 이용=>꺼내기, 읽기)
		
		//국어점수 5개를 배열로 선언하기
		
		int[] kors = new int[5];
		
		//int형 변수 연속적으로 5개 확보해주세요
		
		//배열의 값을 저장하기
		//배열의 요소
		//1차원 배열의 요소는 변수(기억장소)이다
		
		kors[0]=90;
		kors[1]=99;
		kors[2]=88;
		kors[3]=100;
		kors[4]=98;
		
		System.out.println(kors[0]);
		System.out.println(kors[1]);
		System.out.println(kors[2]);
		System.out.println(kors[3]);
		System.out.println(kors[4]);
		
		System.out.println("반복문으로 출력");
	
		for(int i=0;i<5;i++) {
			System.out.println(kors[i]);
			
		}
		
	}

}
