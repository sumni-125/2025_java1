package day03;

public class 형변환 {

	public static void main(String[] args) {
		
		//형: 자료형(type)
		
		//형변환 : type을 변환하는 것
		// -자동형변환(묵시적)
		// -강제형변환(명시적)
		
		byte b =127;	//-128~127
		byte c = (byte)128; //형을 강제로 변환시킴	=> 오버플로우 발생
		System.out.println(c);
		
		int su1=10;
		int su2=3;
		
		double result = su1/su2;
		
		System.out.println(result);
		
		double result2 = su1/(double)su2;	//=> su2변수를 일시적으로 double형으로 변환할 때 사용
		
		double num = 25.3;
		int su3=(int)num;	//정수변수 = (int) 실수형데이터
		
		System.out.println(su3);
		
		//형변환
		//큰변수 = 작은변수		(자동으로 형변환 함)	맥주컵=소주컵
		//작은수변수 = (작은변수type)큰변수	(일시적으로 형을 변환하여 사용	:	강제형변환, 명시적변환)
		
									//데이터 손실이 발생함
									//소주컵 = 맥주컵
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
