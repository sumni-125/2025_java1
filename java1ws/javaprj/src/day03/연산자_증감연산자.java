package day03;

public class 연산자_증감연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		int b=10;
		int result=++a;
		int result2=b++;
		
		System.out.println("a="+a);//11
		System.out.println("b="+b);//11
		System.out.println("result="+result);//11
		System.out.println("result2="+result2);//10
		
		
		int x=10, y=9,z=8;
		int result3;
		
		x++;//11
		--y;//8
		z++;//9
		
		result3 = --x + y++ + --z;//10+8+8=26
		
		System.out.println(result3);
	}

}
