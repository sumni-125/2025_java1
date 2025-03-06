package day14.인터페이스.계산기인터페이스;

public class LGCalculator implements Calculator{

	@Override
	public int add(int su1, int su2) {
		System.out.println("lg add");
		
		return su1+su2;
	}

	@Override
	public int sub(int su1, int su2) {
		System.out.println("lg sub");
		return su1-su2;
	}

	@Override
	public int mul(int su1, int su2) {
		System.out.println("lg mul");
		return su1*su2;
	}

	@Override
	public double div(int su1, int su2) {
		System.out.println("lg div");
		return su1/su2;
	}

}
