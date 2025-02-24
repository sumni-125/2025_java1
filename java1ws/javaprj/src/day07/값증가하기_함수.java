package day07;

public class 값증가하기_함수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int index =0;
		index = 증가하기(index);
		System.out.println(index);
	}
	
	public static int 증가하기(int num) {
		//num++;
		return ++num;
	}

}
