package day14.인터페이스.계산기인터페이스;

public class SuminCalculator implements Calculator{
	
	@Override
	public int add(int su1, int su2) {
		System.out.println("더하기~~~");
		return su1+su2;
	}

	@Override
	public int sub(int su1, int su2) {
		System.out.println("빼기~~~");
		return su1-su2;
	}
	
	@Override
	public int mul(int su1, int su2) {
		System.out.println("곱하기~~~");
		return su1*su2;
	}

	@Override
	public double div(int su1, int su2) {
		System.out.println("나누기~~~");
		return su1/su2;
	}

	
}
