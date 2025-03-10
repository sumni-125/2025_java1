package day16.prac.exception;

public class Calculator2 {
	
	
	public int add(int su1, int su2) {
		//음수이면 예외가 발생하도록 하자
		if(su1<0 || su2<0) {
			//throw: 예외를 일으키는 코드
			System.out.println("음수입력불가");
			return -99; //int 반환의 약속을 지키기 위해서 -99라는 임의의 값을 사용하였음
		}

		///
		///
		return su1+su2;
	}
	
}
